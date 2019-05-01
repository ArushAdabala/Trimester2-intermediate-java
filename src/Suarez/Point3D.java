package Suarez;

public class Point3D extends Point{
    private int z;
    public Point3D(int newZ){
        super(5,6);
        z= newZ;
    }
    public int getX(){
        return super.getX();
    }
    public int getY(){
        return super.getY();
    }
    public int getZ(){
        return z;
    }
    public void setX(int newX){
        super.setX(newX);
    }
    public void setY(int newY){
        super.setY(newY);
    }
    public void setZ(int newZ){
        z = newZ;
    }
}
