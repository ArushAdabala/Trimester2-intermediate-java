package Suarez;

import javax.swing.*;
import java.io.IOException;
import java.util.*;
public class FinalProjectClient {
    public static void main(String[] args)throws IOException {
        //Print Instructions
        JOptionPane.showMessageDialog(null,"Type in a word that matches the first and last letter given to you.");
        JOptionPane.showMessageDialog(null,"If you type in a word that doesn't match the first and letter you lose a point");
        JOptionPane.showMessageDialog(null,"You lose a point for typing in a word that doesn't exist.");
        JOptionPane.showMessageDialog(null,"For the first two turns you can type a word tha is longer than 2 letters.");
        JOptionPane.showMessageDialog(null,"For the next six turns you can type a word that is longer than 5 letters.");
        JOptionPane.showMessageDialog(null,"After that you must type in a word longer than 7 letters");

        // Create a variable to increment the number of games played.
        int playcounter = 1;

        //Create level object.
        Levels level = new Levels();

        //Output your initial level.
        JOptionPane.showMessageDialog(null,"Your current score is "+level.toString());


        //Create first 2 levels
        FinalProject1 main = new FinalProject1(3, "C:\\Users\\Arush\\Desktop\\Dictionary.txt");
        while (main.EndGame() == 1 && playcounter <= 2) {


            //Start the Game.
            main.GamePlay();

            //Increment the number of games played
            playcounter++;


            //Break the loop to move on to the next level
            if (main.EndGame() == 0) {
                break;
            }
            if (playcounter > 2){
                break;
            }

            //Set the score
            level.setLevel(playcounter - 1);




        }

        //Create next six levels
        FinalProject2 main2 = new FinalProject2(5, "C:\\Users\\Arush\\IdeaProjects\\9th Grade Tri2\\src\\Suarez\\Dictionary2");
        while(main2.EndGame() == 1 && playcounter <= 8 && playcounter > 2) {




            main2.GamePlay();

            playcounter++;



            if(main2.EndGame() == 0){
                break;
            }

            if (playcounter > 8){
                break;
            }

            level.setLevel(playcounter - 1);

        }

        //Create remaining levels
        FinalProject3 main3 = new FinalProject3(7, "C:\\Users\\Arush\\IdeaProjects\\9th Grade Tri2\\src\\Suarez\\Dictionary3");
        while(main3.EndGame() == 1 && playcounter > 8) {


            main3.GamePlay();


            playcounter++;



            if(main3.EndGame() == 0){
                break;
            }

            level.setLevel(playcounter - 1);

        }

        //Print score
        JOptionPane.showMessageDialog(null,"Your score is " + level.toString());

    }

}