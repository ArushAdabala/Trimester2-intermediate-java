package Suarez;
/*
Arush
4/1/2019
Monthly temp bar graph
 */
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.*;

public class MonthTempGraphClient extends Application {
    Scanner input = new Scanner(System.in);

    public void start(Stage stage) {

        int [] MonthlyTemp = new int[12];
        String [] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String MaxMonth = "";
        String MinMonth = "";
        int sum = 0;
        int max = -1000;
        int min = 1000;
        for(int i = 0; i<12 ; i++){
            System.out.println("Please type in the average temperature for month "+Month[i]);
            while(!input.hasNextInt() && MonthlyTemp[i]<=120 && MonthlyTemp[i]>=0) {
                System.out.println("The input was invalid. Please type in the average temperature for month "+Month[i]);
                input.next();
            }
            MonthlyTemp[i] = input.nextInt();
            sum += MonthlyTemp[i];
            if(MonthlyTemp[i]>max){
                max = MonthlyTemp[i];
                MaxMonth = Month[i];
            }
            if(MonthlyTemp[i]<min){
                min = MonthlyTemp[i];
                MinMonth = Month[i];
            }

        }

        Integer Max = new Integer(max);
        String Maximum = Max.toString();
        Integer Min = new Integer(min);
        String Minimum = Min.toString();
        Integer Avg = new Integer(sum/12);
        String Average = Avg.toString();

        Integer temp = new Integer(MonthlyTemp[0]);
        String temp1 = temp.toString();
        Integer tempa = new Integer(MonthlyTemp[1]);
        String temp2 = tempa.toString();
        Integer tempb = new Integer(MonthlyTemp[2]);
        String temp3 = tempb.toString();
        Integer tempc = new Integer(MonthlyTemp[3]);
        String temp4 = tempc.toString();
        Integer tempd = new Integer(MonthlyTemp[4]);
        String temp5 = tempd.toString();
        Integer tempe = new Integer(MonthlyTemp[5]);
        String temp6 = tempe.toString();
        Integer tempf = new Integer(MonthlyTemp[6]);
        String temp7 = tempf.toString();
        Integer tempg = new Integer(MonthlyTemp[7]);
        String temp8 = tempg.toString();
        Integer temph = new Integer(MonthlyTemp[8]);
        String temp9 = temph.toString();
        Integer tempi = new Integer(MonthlyTemp[9]);
        String temp10 = tempi.toString();
        Integer tempj = new Integer(MonthlyTemp[10]);
        String temp11 = tempj.toString();
        Integer tempk = new Integer(MonthlyTemp[11]);
        String temp12 = tempk.toString();
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage,"Drawing A Sprite",1000,700);
        MonthTempGraphObj month1 = new MonthTempGraphObj(gc,Color.BLUE,126,MonthlyTemp[0],stage,temp1,"Jan");
        MonthTempGraphObj month2 = new MonthTempGraphObj(gc,Color.BLUE,184,MonthlyTemp[1],stage,temp2,"Feb");
        MonthTempGraphObj month3 = new MonthTempGraphObj(gc,Color.BLUE,242,MonthlyTemp[2],stage,temp3,"Mar");
        MonthTempGraphObj month4 = new MonthTempGraphObj(gc,Color.YELLOW,300,MonthlyTemp[3],stage,temp4,"Apr");
        MonthTempGraphObj month5 = new MonthTempGraphObj(gc,Color.YELLOW,358,MonthlyTemp[4],stage,temp5,"May");
        MonthTempGraphObj month6 = new MonthTempGraphObj(gc,Color.RED,416,MonthlyTemp[5],stage,temp6,"Jun");
        MonthTempGraphObj month7 = new MonthTempGraphObj(gc,Color.RED,474,MonthlyTemp[6],stage,temp7,"Jul");
        MonthTempGraphObj month8 = new MonthTempGraphObj(gc,Color.RED,532,MonthlyTemp[7],stage,temp8,"Aug");
        MonthTempGraphObj month9 = new MonthTempGraphObj(gc,Color.YELLOW,590,MonthlyTemp[8],stage,temp9,"Sep");
        MonthTempGraphObj month10 = new MonthTempGraphObj(gc,Color.YELLOW,648,MonthlyTemp[9],stage,temp10,"Oct");
        MonthTempGraphObj month11 = new MonthTempGraphObj(gc,Color.BLUE,706,MonthlyTemp[10],stage,temp11,"Nov");
        MonthTempGraphObj month12 = new MonthTempGraphObj(gc,Color.BLUE,764,MonthlyTemp[11],stage,temp12,"Dec");

        gc.setStroke(Color.BLACK);
        gc.strokeText("The maximum monthly temperature was "+Maximum+" in the month of "+MaxMonth,0,600);
        gc.strokeText("The minimum monthly temperature was "+Minimum+" in the month of "+MinMonth,375,600);
        gc.strokeText("The average monthly temperature was "+Average,750,600);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
