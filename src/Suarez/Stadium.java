package Suarez;

public class Stadium extends Venue{
    private final int $_PREMIUM_SEAT = 200;
    private final int $_GENERAL_SEAT = 75;
    private final int MAX_PREMIUM_SEATS;
    private final int MAX_GENERAL_SEATS;
    private int premiumSeatsSold, generalSeatsSold;

    public Stadium(String name, int capacity, int premiumSeats){
        super(name,capacity);
        MAX_PREMIUM_SEATS = premiumSeats;
        MAX_GENERAL_SEATS = capacity - premiumSeats;
    }

    public double getRevenue(){
        return MAX_GENERAL_SEATS * $_GENERAL_SEAT + MAX_PREMIUM_SEATS * $_PREMIUM_SEAT;
    }
}
