import java.util.Scanner;
import java.awt.Color;

import java.awt.Color;

public abstract class FillableShape extends Shape{
    private boolean filled = false;

    public FillableShape(){
    }
    
    public FillableShape( int x1, int y1, int x2, int y2, Color color, boolean filled){
        super(x1, y1, x2, y2, color);
        setFilled(filled);
    }
   
    public boolean getFilled(){
        return filled;
    }

    // set filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    // return upper left x value 
    public int getUpperLeftX(){
        return Math.min(super.getX1(), super.getX2());
    }
    // return upper left y value 
    public int getUpperLeftY(){
        return Math.min(super.getY1(), super.getY2());
    }
    // returns the difference in width 
    public int getWidth(){
        return Math.abs(super.getX1() - super.getX2());
    }
    // returns the difference in height
    public int getHeight(){
        return Math.abs(super.getY1() - super.getY2());
    }
    public String toString(){
        return (super.getX1() + " " + super.getY1() + " "+ super.getX2() +" "+ super.getY2() +" " + filled);
    }
}
