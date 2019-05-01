package Suarez;

public class Height {
    private int inches;
    private int feet;
    public Height(int newF, int newI){
        feet = newF;
        inches = newI;
        simplify();
    }
    public Height(int newI){
        inches = newI;
        simplify();
    }
    public void simplify(){
        if(inches%12 != 0){
            feet += inches/12;
            inches = inches%12;
        }
    }
    public void add(int newI){
        inches += newI;
        simplify();
    }
    public void add(Height ht){



        if(ht instanceof Height) {

            Height height = (Height) ht;
            feet += ht.feet;
            inches += ht.inches;
            simplify();

        }

        else{

            System.out.println("The object must be of type Height");

        }

    }
    public int getfeet(){
        return feet;
    }
    public int getInches(){
        return inches;
    }
}
