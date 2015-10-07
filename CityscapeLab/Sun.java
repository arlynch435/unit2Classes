import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a sun with modular color and phase.
 * 
 * @author Austin Lynch
 * @version 10/1/15
 */
public class Sun
{
    /** defines the color of the sun */
    private Color shade;
    private int start;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(Color shade)
    {
        this.shade=shade;
        this.start=750;
    }

    /**
     * Draws the moon
     * @param    g2    the parameter that draws the moon
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double showSun=new Ellipse2D.Double(this.start,50,100,100);
        g2.setColor(shade);
        g2.draw(showSun);
        g2.fill(showSun);
    }
    
    /**
     * Moves the sun across the sky
     */
    public void moveLeft()
    {
        this.start-=25;
    }

}
