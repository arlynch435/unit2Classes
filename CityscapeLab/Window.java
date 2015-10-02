import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Makes a window for the building.
 * 
 * @author Austin Lynch
 * @version 10/2/15
 */
public class Window
{
    /** determines the left x coordinate of the window */
    private int xLeft;
    /** determines the top y coordinate of the window */
    private int yTop;

    /**
     * Default constructor for objects of class window
     */
    public Window(int xLeft, int yTop)
    {
        this.xLeft=xLeft;
        this.yTop=yTop;
    }

    /**
     *Draws the window
     * @param    g2    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body=new Rectangle(this.xLeft,this.yTop,40,20);
        g2.setColor(Color.YELLOW);
        g2.draw(body);
        g2.fill(body);
    }

}
