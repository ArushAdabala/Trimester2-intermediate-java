package Suarez;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class FinalProject1 {

    //Initialize the score
    public static int score = 0;
    private static int MIN;
    private static String path;

    //Create Object to set difficulty that will be inherited
    public FinalProject1(int min, String path1){
        MIN = min;
        path = path1;
    }

    //Accessor
    public int getMin(){
        return MIN;
    }


    public static void GamePlay() throws IOException {

        //Variable that will tell if first and last letters match
        int count = 0;

        //Scans File
        Scanner inputFile = new Scanner(new File(path));

        String[] words = new String[58110];

        //Sets up a counter
        int counter = 0;

        //Puts it into an array
        while (inputFile.hasNextLine()) {
            words[counter] = inputFile.nextLine();
            counter++;
        }




        // Generate two random letters.
        Random rand = new Random();
        int randomNum = rand.nextInt(words.length);
        char firstLetter = words[randomNum].toLowerCase().charAt(0);
        int last=words[randomNum].length();
        char secondLetter = words[randomNum].toLowerCase().charAt(last-1);
        JOptionPane.showMessageDialog(null,"First letter = " + firstLetter + "   Last letter = " + secondLetter);

        //User inputs a letter
        String typedWord = JOptionPane.showInputDialog(null,"Type a Word");
        String checkingWord = typedWord.toUpperCase();
        char letter1 = checkingWord.toLowerCase().charAt(0);
        char letter2 = checkingWord.toLowerCase().charAt(typedWord.length() - 1);

        //Checks if the word is long enough
        if (typedWord.length() >= MIN) {
            //Checks if the first and last letter match
            if (letter1 == firstLetter && letter2 == secondLetter) {
                for (int i = 0; i < words.length; i++) {
                    //Checks if the word is in the dictionary.
                    if (typedWord.equalsIgnoreCase(words[i])) {
                        JOptionPane.showMessageDialog(null,"Correct");
                        score++;
                        count++;

                    }
                    //If not, score decrements
                    else if(i == words.length-1 && count == 0){
                        JOptionPane.showMessageDialog(null,"Incorrect");
                        score--;
                    }
                }
            //If the first and last letter don't match, the score decrements
            } else {
                JOptionPane.showMessageDialog(null,"here");
                score--;

            }
        }
        //If the word is too short, the score decrements
        else{
            JOptionPane.showMessageDialog(null,"Too Short");
            score--;
        }
    }

    //Tells the client class whether the turn was a failure or a success
    public static int EndGame(){
        if(score < 0) {
            return 0;
        }
        else{
            return 1;
        }
    }
}
