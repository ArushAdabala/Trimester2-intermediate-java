package Suarez;

public class AirportObject {
    private String airportCode;
    private int numberOfGates;
    public AirportObject() //Default constructor
    {
        airportCode = "";
        numberOfGates = 0;
    }
    public AirportObject(String code1, int gates2) //Default constructor
    {
        airportCode = code1;
        numberOfGates = gates2;
    }
    public void setAirport(String code1, int gates2)
    {
        airportCode = code1;
        numberOfGates = gates2;
    }

    public int getAirportGates()
    {

        return numberOfGates;
    }
    public String getAirportCode()
    {
        return airportCode;
    }
    @Override
    public String toString()
    {
        return "The airport code is ("+airportCode+") + \n+\"The number of gates is (\"+ numberOfGates +\")";

    }

    public boolean equals(Object object1) {
        if (object1 instanceof AirportObject) {
            AirportObject airport2 = (AirportObject) object1;
            return (toString().equals(airport2.toString()));
        }
        else {
            System.out.println("The object must be of type Airport");
            return false;
        }
    }

}
