import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape { 
    
    // Constructor to initialize all instance variables
    public Line( int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2, color);
    } 
    
    // Given a Graphics object (g), this method will draw the current Line object
    public void draw( Graphics g ) {
        g.setColor(super.getColor());
        g.drawLine(super.getX1(), super.getY1(), super.getX2(), super.getY2());
    } 
} 

