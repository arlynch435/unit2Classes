import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
/**
 * Creates a gray, generic door
 * 
 * @author Austin Lynch
 * @version 10/2/15
 */
public class Door
{
    /** xLeft defines the far left coordinate of the building */
    private int xLeft;
    /** xLeft defines the top coordinate of the building */
    private int yTop;

    /**
     * Default constructor for objects of class door
     */
    public Door(int xLeft,int yTop)
    {
        this.xLeft=xLeft;
        this.yTop=yTop;
    }

    /**
     * Draws the door on a building
     * @param    g2     parameter that draws the moon
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body=new Rectangle(this.xLeft,this.yTop,20,40);
        Ellipse2D.Double knob=new Ellipse2D.Double(this.xLeft+15,this.yTop+15,5,5);
        g2.setColor(Color.GRAY);
        g2.draw(body);
        g2.fill(body);
        g2.setColor(Color.BLACK);
        g2.draw(knob);
    }

}
