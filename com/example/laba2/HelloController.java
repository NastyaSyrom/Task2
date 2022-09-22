package com.example.laba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import model.mnogougolniki;

public class HelloController {

    @FXML
    private Canvas my_canvas = new Canvas(300, 300);

    @FXML
    private TextField sides_number;

    @FXML
    private  Label labe1;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        try{

            mnogougolniki my_mnogougolniki = new mnogougolniki(Color.DARKRED,  Integer.parseInt(sides_number.getText()), 100);

            my_mnogougolniki.ClearCanvas(my_canvas.getGraphicsContext2D(), my_canvas.getHeight(), my_canvas.getWidth());

            my_mnogougolniki.DrawShape(my_canvas.getGraphicsContext2D(),  my_canvas.getHeight(), my_canvas.getWidth());

            System.out.println(my_mnogougolniki.toString());

        }catch(NumberFormatException ex){
            labe1.setText("Данные введены не корректно!");
        }
    }
}