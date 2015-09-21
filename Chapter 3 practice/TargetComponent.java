import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Draws the target(s).
 * 
 * @author Austin Lynch
 * @version 9/21/15
 */
public class TargetComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        Target target1=new Target(0,0);
        target1.draw(g2);
        
    }

}
