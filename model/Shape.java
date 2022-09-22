package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    Color ShapeColor;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc, double CanvasHeight, double CanvasWidth);

    public void setColor(Color color) {
        this.ShapeColor = color;
    }
    public void ClearCanvas(GraphicsContext gc, double CanvasHeight, double CanvasWidth){
        gc.clearRect(0, 0, CanvasWidth, CanvasHeight); // очистка холста
    }

    public Shape(Color color) {
        System.out.println("Произошёл вызов конструктора");
        this.ShapeColor = color;
    }
}
