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
        Horse [] barnA = {new Horse("Xander"), new Horse("Xander"), new Horse("Xander"), new Horse("Xander"), null,new Horse("Xander")};
        Horse [] barnB = {new Horse("Xander"), new Horse("Xander"), new Horse("Xander"), new Horse("Xander"), new Horse("Xander"),new Horse("Xander")};
        Horse [] barnC = {new Horse("Xander"), new Horse("Xander"), new Horse("Xander"), null, new Horse("Xander"), new Horse("Xander")};

        //Creating HorseBarn objects using the Horse objects
        HorseBarn barn1 = new HorseBarn(barnA);
        HorseBarn barn2 = new HorseBarn(barnB);
        HorseBarn barn3 = new HorseBarn(barnC);

        //Testing the setBarnLength method
        barn1.setBarnLength(8);

        //Testing the setHorses method
        barn1.setHorses(new Horse("Amon"),6);
        barn1.setHorses(new Horse("Matthew"),7);

        //Testing the to string method
        System.out.println(barn1.toString());

        //Testing the findHorseSpace method
        System.out.println(barn1.findHorseSpace("Amon"));

        //Question c) Find the biggest HorseBarn object.
        if(barn1.getHorses().length>barn2.getHorses().length){
            if(barn3.getHorses().length>barn1.getHorses().length){
                System.out.println("barn 3 is the longest");
            }
            else{
                System.out.println("barn 1 is the longest");
            }
        }
        else{
            if(barn3.getHorses().length>barn2.getHorses().length){
                System.out.println("barn 3 is the longest");
            }
            else{
                System.out.println("barn 2 is the longest");
            }
        }

        //Question c) Combines the three object arrays.
        Horse [] barnD = new Horse[barn1.getHorses().length+barn2.getHorses().length+barn3.getHorses().length];
        for(int i = 0; i < barn1.getHorses().length; i++){
            barnD[i] = barn1.getHorses()[i];
        }
        for(int j = 0; j < barn2.getHorses().length; j++){
            barnD[j+barn1.getHorses().length] = barn2.getHorses()[j];
        }
        for(int k = 0; k < barn3.getHorses().length; k++){
            barnD[k+(barn1.getHorses().length+barn2.getHorses().length)] = barn3.getHorses()[k];
        }
        HorseBarn barnCombination = new HorseBarn(barnD);
        System.out.println(barnCombination.toString());
    }
}
