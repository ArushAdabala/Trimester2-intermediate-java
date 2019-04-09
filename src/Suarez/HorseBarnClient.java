package Suarez;
/*
Arush Adabala
4/8/2019
This class is used to test the HorseBarn object and its various methods.
This class also combines multiple HorseBarn Objects, and it finds the longest HorseBarn object.
*/
public class HorseBarnClient {
    public static void main(String[] args) {

        //Declaring the longest variable in order to find the biggest HorseBarn object
        int longest = 0;

        //Creating Horse objects
        Horse [] barnA = {new Horse("Xander"), new Horse("Aarian"), new Horse("Arush"), new Horse("Chadley"), null,new Horse("Bradley")};
        Horse [] barnB = {new Horse("Joey"), new Horse("Joseph"), new Horse("Johnathan"), null, new Horse("Andrew"),null};
        Horse [] barnC = {new Horse("Matteo"), new Horse("Fermier"), new Horse("Cole"), null, new Horse("Dhanani"), new Horse("Adabala")};

        //Creating HorseBarn objects using the Horse objects
        HorseBarn barn1 = new HorseBarn(barnA);
        HorseBarn barn2 = new HorseBarn(barnB);
        HorseBarn barn3 = new HorseBarn(barnC);

        //Question c) Creating the stable or the array of barns
        HorseBarn[] stable = {barn1, barn2, barn3};

        //Testing the setBarnLength method
        barn1.setBarnLength(8);

        //Testing the setHorses method
        barn1.setHorses(new Horse("Amon"),6);
        barn1.setHorses(new Horse("Matthew"),7);

        //Testing the to string method
        System.out.println(barn1.toString());

        //Testing the findHorseSpace method
        System.out.println(barn1.findHorseSpace("Amon"));

        //Question c) Find the Barn with the most number of horses.
        if(stable[0].getNumberOfHorses() > stable[2].getNumberOfHorses()){
            if(stable[0].getNumberOfHorses() > stable[2].getNumberOfHorses()){
                System.out.println("The first barn has the most horses");
            }
            else if(stable[0].getNumberOfHorses() < stable[2].getNumberOfHorses()){
                System.out.println("The third barn has the most horses");
            }
            else{
                System.out.println("The first and third barn have the same number of horses, and they both have the most number of horses.");
            }
        }
        else if(stable[0].getNumberOfHorses() > stable[2].getNumberOfHorses()){
            if(stable[1].getNumberOfHorses() > stable[2].getNumberOfHorses()){
                System.out.println("The second barn has the most horses");
            }
            else if(stable[1].getNumberOfHorses() < stable[2].getNumberOfHorses()){
                System.out.println("The third barn has the most horses");
            }
            else{
                System.out.println("The second and third barn have the same number of horses, and they both have the most number of horses.");
            }
        }
        else{
            if(stable[1].getNumberOfHorses() > stable[2].getNumberOfHorses()){
                System.out.println("The first and third barn have the same number of horses, and they both have the most number of horses.");
            }
            else if(stable[1].getNumberOfHorses() < stable[2].getNumberOfHorses()){
                System.out.println("The third barn has the most horses");
            }
            else{
                System.out.println("The first, second, and third barn have the same number of horses.");
            }
        }
    }
}

