import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Makes a Skyline.
 * 
 * @author Austin Lynch
 * @version 10/2/15
 */
public class Skyline
{
    /** determines the left x coordinate of dusk */
    private int duskXLeft;
    /** determines the top y coordinate of dusk */
    private int duskYTop;
    /** determines how far dusk has raveled */
    private int duskWidth;

    

    /**
     * Default constructor for objects of class window
     */
    public Skyline()
    {
        this.duskXLeft=800;
        this.duskYTop=0;
        this.duskWidth=0;
    }

    /**
     *Draws the window
     * @param    g2    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle day=new Rectangle(0,0,800,330);
        g2.setColor(Color.BLUE);
        g2.draw(day);
        g2.fill(day);
        Rectangle dusk=new Rectangle(this.duskXLeft,this.duskYTop,this.duskWidth,330);
        g2.setColor(Color.BLACK);
        g2.draw(dusk);
        g2.fill(dusk);
    }
    /**
     * Makes Dusk creep up on the day
     */
    public void moveLeft()
    {
        this.duskWidth+=25;
        this.duskXLeft-=25;
    }

}
