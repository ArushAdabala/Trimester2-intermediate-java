package Suarez;

public class AutoObject {
    private String model;
    private int miles;
    private double gallons;

        public AutoObject() //Default constructor
        {
            model = "";
            miles = 0;
            gallons = 0.0;
        }
        public AutoObject(String model1, int miles1, double gallons1) //Default constructor
        {
            model = model1;
            miles = miles1;
            gallons = gallons1;
        }
        public void setAutoModel(String model1)
        {
            this.model = model1;
            return this;

        }
        public void setAutoModel(int miles1)
        {
            this.miles = miles1;
            return this;

        }
        public void setAutoModel(double gallons1)
        {
            this.gallons = gallons1;
            return this;

        }

        public int getMiles()
        {

            return miles;
        }
        public String getModel()
        {
            return model;
        }
        public double getGallons()
        {
            return gallons;
        }
        @Override
        public String toString()
        {
            return "The number of miles driven is ("+miles+") + \n+\"The number of gallons is ("+ gallons +")"+" The model is a ("+model+")";

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