import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * A target shape that can be positioned anywhere.
 * 
 * @author Austin Lynch
 * @version 9/21/15
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xCenter;
    private int yCenter;
    private double height;
    private double width;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y, double height, double width)
    {
        this.xCenter=x;
        this.yCenter=y;
        this.height=height;
        this.width=width;
    }

    /**
     * Draws the target
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double biggestCircle= new Ellipse2D.Double(this.xCenter-(width*62.5),this.yCenter-(height*62.5),125*width,125*height);
       Ellipse2D.Double bigCircle= new Ellipse2D.Double(this.xCenter-(width*50),this.yCenter-(height*50),100*width,100*height);
       Ellipse2D.Double mediumCircle= new Ellipse2D.Double(this.xCenter-(width*37.5),this.yCenter-(height*37.5),75*width,75*height);
       Ellipse2D.Double smallCircle= new Ellipse2D.Double(this.xCenter-(width*25),this.yCenter-(height*25),50*width,50*height);
       Ellipse2D.Double smallestCircle= new Ellipse2D.Double(this.xCenter-(width*12.5),this.yCenter-(height*12.5),25*width,25*height);
       g2.setColor(Color.BLACK);
       g2.draw(biggestCircle);
       g2.fill(biggestCircle);
       g2.setColor(Color.WHITE);
       g2.draw(bigCircle);
       g2.fill(bigCircle);
       g2.setColor(Color.BLACK);
       g2.draw(mediumCircle);
       g2.fill(mediumCircle);
       g2.setColor(Color.WHITE);
       g2.draw(smallCircle);
       g2.fill(smallCircle);
       g2.setColor(Color.BLACK);
       g2.draw(smallestCircle);
       g2.fill(smallestCircle);
    }

}
