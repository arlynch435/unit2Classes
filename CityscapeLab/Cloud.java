import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud
{
    /** defines where the x position of the cloud is */
    private int xPos;

    /**
     * Default constructor for objects of class Star
     */
    public Cloud(int xPos)
    {
        // initialise instance variables
        this.xPos = xPos;
    }

   /**
     * Draws the moon
     * @param    g2    the parameter that draws the cloud
     */
    public void draw(Graphics2D g2)
    {
        Random cloudCircles=new Random();
        Random cirlceSize=new Random();
        Random circleLocation=new Random();
        for (int i=cloudCircles.nextInt(5)+3;
            i>0;
            i-=1)
            {
                Double circleDiam=cirlceSize.nextDouble()*100;
                Ellipse2D circle=new Ellipse2D.Double((circleLocation.nextInt(100))+this.xPos,
                                            circleLocation.nextInt(160),
                                            circleDiam,circleDiam);
                g2.setColor(Color.WHITE);
                g2.draw(circle);
                g2.fill(circle);
            }
    }

}
