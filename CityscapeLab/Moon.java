import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a moon with modular color and phase.
 * 
 * @author Austin Lynch
 * @version 10/1/15
 */
public class Moon
{
    /** defines the color of the moon */
    private Color shade;
    private int start;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(Color shade)
    {
        this.shade=shade;
        this.start=650;
    }

    /**
     * Draws the moon
     * @param    g2    the parameter that draws the moon
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double showMoon=new Ellipse2D.Double(this.start,50,100,100);
        g2.setColor(shade);
        g2.draw(showMoon);
        g2.fill(showMoon);
    }
    
    /**
     * Draws the moon
     * @param    g2    the parameter that draws the moon
     */
    public void moveLeft(Graphics2D g2)
    {
        this.start+=100;
        Ellipse2D.Double showMoon=new Ellipse2D.Double(this.start,50,100,100);
        g2.setColor(shade);
        g2.draw(showMoon);
        g2.fill(showMoon);
    }

}
