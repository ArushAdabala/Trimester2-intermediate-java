package Suarez;

public class Levels {
    private int level;
    public Levels() //Default constructor
    {
        level = 0;
    }
    public Levels(int level1) //Default constructor
    {
        level = level1;
    }
    public void setLevel(int level1)
    {
        level = level1;
    }

    public int getLevel()
    {
        return level;
    }
    public String toString()
    {
        return "("+level+")";
    }
}