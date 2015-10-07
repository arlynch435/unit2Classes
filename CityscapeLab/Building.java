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
        int trueWidth=this.width*45;
        int yTop= 600-((this.floors*30)+200);
        int height=(this.floors*30);
        Rectangle body=new Rectangle(xLeft,yTop,trueWidth+5,height);
        Door door1=new Door((xLeft+(trueWidth/2)),360);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(body);
        g2.fill(body);
        door1.draw(g2);
        for (int column=0;
             column<this.width;
             column+=1)
        {
          for (int i=this.floors;
              i>1;
              i-=1)
          {
            Window window1=new Window(((column*45)+5)+(this.initial),(600-((i*25)+230)));
            window1.draw(g2);
        }
    }
    }

}
