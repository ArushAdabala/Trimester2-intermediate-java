package Suarez;

public class Club extends Venue{
    private String genre;
    private final double $_SEAT;
    private int ticketSold;

    public Club(String name, int capacity, String musicType, double ticketPrice){
        super(name, capacity);
        $_SEAT = ticketPrice;
        genre = musicType;
    }

    public double getRevenue(){
        return ticketSold * $_SEAT;
    }
}
