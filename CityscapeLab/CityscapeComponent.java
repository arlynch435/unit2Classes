import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int floors;
    private int width;
    private int initial;
    private Moon moon1;
    /**
     * Default constructor for objects of class Building
     */
    public CityscapeComponent(int floors, int width, int initial,Moon moon1)
    {
        this.floors=floors;
        this.width=width;
        this.initial=initial;
        this.moon1=moon1;
    }

    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Random cloudLocation=new Random();
        Rectangle skyline=new Rectangle(0,0,800,330);
        g2.setColor(Color.BLUE);
        g2.draw(skyline);
        g2.fill(skyline);
        this.moon1.draw(g2);
        Cloud cloud1=new Cloud(cloudLocation.nextInt(800));
        cloud1.draw(g2);
        Building building1=new Building(10,7,50);
        building1.draw(g2);
        Building building2=new Building(5,3,250);
        building2.draw(g2);
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame(Graphics g)
    {
        // update the objects in the cityscape so they are animated
        // ...
        Graphics2D g2 = (Graphics2D) g;
        this.moon1.moveLeft(g2);
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
