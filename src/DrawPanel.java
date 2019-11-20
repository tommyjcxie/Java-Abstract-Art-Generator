import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import java.util.ArrayList;
 
public class DrawPanel extends JPanel {
    // We'll use a shared array to store 10 Line objects
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    boolean filled;
    
    // Constructor instantiates an array of 10 Random Line objects
    public DrawPanel() {
        // We'll use the Random class to simplify picking random integers
        Random randomNumber = new Random();   
        setBackground( Color.WHITE );
        
        // Create 10 Line objects with random coordinates and colours
        for ( int count = 0; count < 10; count++ ) {
            // generate random coordinates
            int x1 = randomNumber.nextInt( 500 );
            int y1 = randomNumber.nextInt( 500 );
            int x2 = randomNumber.nextInt( 500 );
            int y2 = randomNumber.nextInt( 500 );
            int a = randomNumber.nextInt( 3 );
            int b = randomNumber.nextInt( 2 );
            // generate a random color
            Color color = new Color( randomNumber.nextInt( 256 ), 
                                    randomNumber.nextInt( 256 ), randomNumber.nextInt( 256 ) );
            
            
            if ( b == 0){
                filled = true;
            } else if (b == 1){ 
                filled = false;
            }
            
            if (a == 0){ 
                shapes.add(new Line(x1, y1, x2, y2, color));
            } else if ( a == 1){
                shapes.add(new Circle(x1, y1, x2, y2, color, filled));
            } else if ( a == 2){
                shapes.add(new Rectangle(x1, y1, x2, y2, color, filled));
            }  
        } 
    } 
    
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        
        // Call the draw() method for each Line object in the array
        for ( Shape shape : shapes ){
            shape.draw( g );
        }
    } 
} 
