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
    /** defines the stage of the moon from Full to New Moon (wane to wax) */
    private int phase;
    /** defines the color of the moon */
    private Color shade;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int phase,Color shade)
    {
        this.phase=phase;
        this.shade=shade;
    }

    /**
     * Draws the moon
     * @param    g2    the parameter that draws the moon
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double showMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(shade);
        g2.draw(showMoon);
        g2.fill(showMoon);
     if (this.phase==1)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==2)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==3)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==4)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==5)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==6)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==7)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==8)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==9)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
     if (this.phase==10)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
        if (this.phase==11)
        {
        Ellipse2D.Double hideMoon=new Ellipse2D.Double(650,50,100,100);
        g2.setColor(Color.BLACK);
        g2.draw(hideMoon);
        g2.fill(hideMoon);
    }
    }

}
