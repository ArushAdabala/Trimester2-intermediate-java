package Suarez;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MonthlyBarGraph extends Application{


    public void start(Stage stage){
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage,"Drawing A Sprite",700,700);
        int sX = 0;
        int sY = 400;
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+6,sY-62,50,62);
        gc.setStroke(Color.BLACK);
        gc.strokeText("31",sX+24,sY-70);
        gc.strokeText("Jan",sX+20,sY-85);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+64,sY-48,50,48);
        gc.setStroke(Color.BLACK);
        gc.strokeText("24",sX+82,sY-56);
        gc.strokeText("Feb",sX+78,sY-71);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+122,sY-90,50,90);
        gc.setStroke(Color.BLACK);
        gc.strokeText("45",sX+140,sY-98);
        gc.strokeText("Mar",sX+136,sY-113);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+180,sY-120,50,120);
        gc.setStroke(Color.BLACK);
        gc.strokeText("60",sX+198,sY-128);
        gc.strokeText("Apr",sX+194,sY-143);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+238,sY-138,50,138);
        gc.setStroke(Color.BLACK);
        gc.strokeText("69",sX+256,sY-146);
        gc.strokeText("May",sX+252,sY-161);
        gc.setFill(Color.RED);
        gc.fillRect(sX+296,sY-160,50,160);
        gc.setStroke(Color.BLACK);
        gc.strokeText("80",sX+314,sY-168);
        gc.strokeText("Jun",sX+310,sY-183);
        gc.setFill(Color.RED);
        gc.fillRect(sX+354,sY-176,50,176);
        gc.setStroke(Color.BLACK);
        gc.strokeText("88",sX+372,sY-184);
        gc.strokeText("Jul",sX+368,sY-199);
        gc.setFill(Color.RED);
        gc.fillRect(sX+412,sY-174,50,174);
        gc.setStroke(Color.BLACK);
        gc.strokeText("87",sX+430,sY-182);
        gc.strokeText("Aug",sX+426,sY-197);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+470,sY-150,50,150);
        gc.setStroke(Color.BLACK);
        gc.strokeText("75",sX+488,sY-158);
        gc.strokeText("Sep",sX+484,sY-173);
        gc.setFill(Color.YELLOW);
        gc.fillRect(sX+528,sY-130,50,130);
        gc.setStroke(Color.BLACK);
        gc.strokeText("65",sX+546,sY-138);
        gc.strokeText("Oct",sX+542,sY-153);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+586,sY-86,50,86);
        gc.setStroke(Color.BLACK);
        gc.strokeText("43",sX+604,sY-94);
        gc.strokeText("Nov",sX+600,sY-109);
        gc.setFill(Color.BLUE);
        gc.fillRect(sX+644,sY-46,50,46);
        gc.setStroke(Color.BLACK);
        gc.strokeText("23",sX+662,sY-54);
        gc.strokeText("Dec",sX+658,sY-69);



    }

    public static void main(String[] args) {
        launch(args);
    }

}
