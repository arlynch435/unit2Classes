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
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        this.xLeft=x;
        this.yTop=y;
    }

    /**
     * Draws the target
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
       Ellipse2D.Double biggestCircle= new Ellipse2D.Double(262.5,262.5,125,125);
       Ellipse2D.Double bigCircle= new Ellipse2D.Double(250,250,100,100);
       Ellipse2D.Double mediumCircle= new Ellipse2D.Double(232.5,232.5,75,75);
       Ellipse2D.Double smallCircle= new Ellipse2D.Double(225,225,50,50);
       Ellipse2D.Double smallestCircle= new Ellipse2D.Double(200,200,25,25);
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
