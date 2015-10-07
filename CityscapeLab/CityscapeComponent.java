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
    private Sun sun1;
    private Skyline skyline1;
    private int cloudCover;
    /**
     * Default constructor for objects of class Building
     */
    public CityscapeComponent(int floors, int width, int initial,Sun sun1,Skyline skyline1,int cloudCover)
    {
        this.floors=floors;
        this.width=width;
        this.initial=initial;
        this.sun1=sun1;
        this.skyline1=skyline1;
        this.cloudCover=cloudCover;
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
        this.skyline1.draw(g2);
        this.sun1.draw(g2);
        for (int i=0;
                i<this.cloudCover;
                i+=1)
         {
        Cloud cloud1=new Cloud(cloudLocation.nextInt(800));
        cloud1.draw(g2);
    }
        Building building1=new Building(10,7,50);
        building1.draw(g2);
        Building building2=new Building(5,3,250);
        building2.draw(g2);
        Building building3=new Building(8,2,650);
        building3.draw(g2);
        Building building4=new Building(8,4,450);
        building4.draw(g2);
        Building building5=new Building(4,2,150);
        building5.draw(g2);
        Cloud cloud2=new Cloud(cloudLocation.nextInt(800));
        cloud2.draw(g2);
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        this.sun1.moveLeft();
        this.skyline1.moveLeft();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
