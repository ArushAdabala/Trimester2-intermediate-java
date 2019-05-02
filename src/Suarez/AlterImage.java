package Suarez;

import java.util.ArrayList;

public class AlterImage {
    private ArrayList<Pixel> pixelArray = new ArrayList<Pixel>();
    public Pixel[][] generatePixelArray(int [][] reds,int [][] greens,int [][] blues){
        for(int i = 0; i < reds.length; i++){
            for(int j = 0; j < reds[i].length; j++) {
                Pixel pixel = new Pixel(reds[i][j],greens[i][j],blues[i][j]);
                pixelArray.add(pixel);
            }
        }
        Pixel[][] truePixelArray = new Pixel[reds.length][(pixelArray.size())/(reds.length)];
        for(int i = 0; i < truePixelArray.length; i++){
            for(int j = 0; j < truePixelArray[i].length; j++) {
                truePixelArray[i][j] = pixelArray.get(i*j);
            }
        }
        return truePixelArray;
    }
    public Pixel[][] flipImage(Pixel[][] image, boolean horiz){
        Pixel [] [] temp;
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++) {
                temp = new Pixel[image.length][image[i].length];
                temp[i][j] = image[i][j];
                image[i][j] = image[image.length-i][image[i].length-j];
                image[image.length-i][image[i].length-j]=image[i][j];
            }
        }
        return image;
    }

}
