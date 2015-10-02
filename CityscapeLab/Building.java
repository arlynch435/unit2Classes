import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Creates a building with windows, a door and modular floors
 * 
 * @author Austin Lynch 
 * @version 10/2/15
 */
public class Building
{
    /** defines how many floors are in the building above ground level */
    private int floors;
    /** defines how wide the building is in terms of windows */
    private int width;
    /** defines where the building begins from the left */
    private int initial;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int floors, int width, int initial)
    {
        this.floors=floors;
        this.width=width;
        this.initial=initial;
    }

    /**
     *Draws the building
     * @param    g2    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        int xLeft= this.initial;
        int trueWidth=this.width*50;
        int yTop= 600-((this.floors*30)+200);
        Rectangle body=new Rectangle(xLeft,yTop,trueWidth,yTop);
        Door door1=new Door((xLeft+(width/2)),500);
        g2.setColor(Color.BLACK);
        g2.draw(body);
        g2.fill(body);
        door1.draw(g2);
    }

}
