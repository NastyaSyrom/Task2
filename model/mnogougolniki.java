package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class mnogougolniki extends Shape{
    private int SNum;
    private int Radius;

    @Override
    public String toString() {
        if (SNum < 3){
            return "Построение не возможно";
        }else if (SNum > 360){
            return "Невозможно построить фигуру с количеством углов больше 360. На экране представлен круг";
        } else if (SNum == 360){
            return "На экране представлен круг";
        } else if (SNum == 3){
            return "На экране представлен треугольник";
        }else if (SNum == 4){
            return "На экране представлен квадрат";
        }else{
            return "На экране представлен n-угольник";
        }
    }

    public String getColor(){
        return "Цвет n-угольника - " + super.ShapeColor;
    }

    @Override
    public void DrawShape(GraphicsContext gc, double CanvasHeight, double CanvasWidth){

        gc.clearRect(0, 0, CanvasWidth, CanvasHeight); // очистка холста

        gc.setFill(Color.DARKRED);

        double[] x_cords = new double[SNum];
        double[] y_cords = new double[SNum];

        for (int i = 0; i < SNum; ++i) {
                x_cords[i] = Radius * Math.cos(2 * Math.PI * i / SNum) + CanvasWidth / 2;
                y_cords[i] = Radius * Math.sin(2 * Math.PI * i / SNum) +CanvasHeight / 2;

            }

        gc.fillPolygon(x_cords, y_cords, x_cords.length);

    }
    public mnogougolniki(Color color, int SNum, int Radius) {
        super(color);
        this.SNum = SNum;
        this.Radius = Radius;
    }

}
