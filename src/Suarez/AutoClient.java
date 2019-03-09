package Suarez;

public class AutoClient {
    public static void main(String[] args) {
        AutoObject auto1 = new AutoObject("DFW",30,0.0);
        AutoObject auto2 = new AutoObject("DFW",40,0.0);
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
    }
}