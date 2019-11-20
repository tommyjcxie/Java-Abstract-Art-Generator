import java.awt.Color;
import java.awt.Graphics;

public class Circle extends FillableShape{
    
    public Circle( int x1, int y1, int x2, int y2, Color color, boolean filled){
        super(x1, y1, x2, y2, color, filled);
    }
    
    public void draw(Graphics g){
       g.setColor(super.getColor());
        if (super.getFilled() == true){
            g.fillOval(super.getUpperLeftX(), super.getUpperLeftY(), super.getWidth(), super.getHeight());
        }else {
            g.drawOval(super.getUpperLeftX(), super.getUpperLeftY(), super.getWidth(), super.getHeight());
        }
        
    }
}

