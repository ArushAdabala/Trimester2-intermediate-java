package Suarez;
/*
Arush Adabala
4/8/2019
This class is used to create the Horse object.
 */
public class Horse {
    //This method instantiates the field
    private String name;

    //Default constructor
    public Horse(){
        name = "";
    }

    //Constructor that initializes the field to the name the user passed as an argument
    public Horse(String name1){
        name = name1;
    }

    //This method accesses the name of the horse
    public String getName(){
        return name;
    }
}
