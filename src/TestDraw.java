import javax.swing.JFrame;
 
public class TestDraw {
    public static void main( String[] args ) {
        JFrame appWindow = new JFrame( "Abstract Art" );
        
        DrawPanel linePanel = new DrawPanel();
        appWindow.add( linePanel );
        
        appWindow.setSize( 500, 500 );
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true );
    }    
}


