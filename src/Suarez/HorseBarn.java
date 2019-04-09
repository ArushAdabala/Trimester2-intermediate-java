package Suarez;
/*
Arush Adabala
4/8/2019
This class is used to create the HorseBarn object.
*/
import java.util.*;
public class HorseBarn {

    //instantiates the field: the spaces in the barn
    private Horse[] spaces;

    public HorseBarn() //Default constructor
    {
        spaces = new Horse[0];
    }

    public HorseBarn(Horse[] array1) //Constructor that initializes the field to the array the user passed as an argument.
    {
        spaces = new Horse[array1.length];
        for(int i = 0; i < spaces.length; i++){
            spaces[i] = array1[i];
        }
    }

    //This method mutates the name of a horse in the barn
    public void setHorses(Horse horse1, int index) {
        spaces[index] = horse1;
    }

    //This method mutates the size of the barn.
    public void setBarnLength(int length) {
        Horse [] temp = new Horse[length];
        for(int i = 0; i < spaces.length; i++){
            temp[i] = spaces[i];
        }
        spaces = temp;
        temp = null;
    }

    //This method accesses the objects (the horses) in the barn.
    public Horse[] getHorses() {
        Horse [] temp = new Horse[spaces.length];
        for(int i = 0; i < spaces.length; i++){
            temp[i] = spaces[i];
        }
        return temp;
    }

    //This method accesses the names of the horses in the barn.
    public String[] getHorsesNames() {
        String [] temp = new String [spaces.length];
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] != null && spaces[i].getName() != null) {
                temp[i] = spaces[i].getName();
            }
        }
        return temp;
    }

    //This method finds the space where the horse the user requested to find is.
    public int findHorseSpace(String name){
        int nameSpace = -1;
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] != null) {
                if (spaces[i].getName().equals(name)) {
                    nameSpace = i;
                }
            }
        }
        return nameSpace;
    }


    //This method converts the object into a string
    @Override
    public String toString() {
        String [] temp = new String [spaces.length];
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] != null && spaces[i].getName() != null) {
                temp[i] = spaces[i].getName();
            }
        }
        return "The horses are "+ Arrays.toString(temp);

    }


    //This method finds if two objects are equal.
    @Override
    public boolean equals(Object object1) {
        boolean b = false;
        if (object1 instanceof HorseBarn) {
            HorseBarn barn = (HorseBarn) object1;
            if (spaces.length == barn.spaces.length) {
                for(int i =0; i < spaces.length; i++){
                    if(spaces[i].getName().equals(barn.spaces[i].getName())){
                        b = true;
                    }
                    else{
                        b = false;
                    }
                }
                return b;
            } else {
                System.out.println("The objects sere different sizes");
                return false;
            }
        } else {
            System.out.println("The object must be of type HorseBarn");
            return false;

        }
    }
}
