package Suarez;

import java.util.ArrayList;

public class AlterImage {
    public Pixel[][] generatePixelArray(int [][] reds,int [][] greens,int [][] blues){
        Pixel[][] pixelArray = new Pixel[reds.length][reds[reds.length-1].length];
        for(int i = 0; i < reds.length; i++){
            for(int j = 0; j < reds[i].length; j++) {
                Pixel pixel = new Pixel(reds[i][j],greens[i][j],blues[i][j]);
                pixelArray[i][j] = pixel;
            }
        }
        

        return pixelArray;
    }
    public Pixel[][] flipImage(Pixel[][] image, boolean horiz){
        Pixel [] [] temp = new Pixel[image.length][image[image.length-1].length];;
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++) {
                
                temp[i][j] = image[i][j];
                image[i][j] = image[image.length-i][image[i].length-j];
                image[image.length-i][image[i].length-j]=image[i][j];
            }
        }
        return image;
    }

}

