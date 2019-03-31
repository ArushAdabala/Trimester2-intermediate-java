package Suarez;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MonthTempGraphObj {



    public MonthTempGraphObj(GraphicsContext gc, Color color, int x, int y, Stage stage, String temp, String month){

        gc.setFill(color);
        gc.fillRect(x,400-(y*2),50,y*2);
        gc.setStroke(Color.BLACK);
        gc.strokeText(temp,x+18,400-(y*2)-8);
        gc.strokeText(month,x+14,400-(y*2)-23);
    }








}
