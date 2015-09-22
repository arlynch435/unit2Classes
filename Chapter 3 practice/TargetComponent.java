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
        Target target1=new Target(200,200,1,1);
        target1.draw(g2);
        Target target2=new Target(800,125,2,3);
        target2.draw(g2);
        //Target target3=new Target(800,500,1,5);
        //target3.draw(g2);
        //Target target4=new Target(1000,500,0.5,0.5);
        //target4.draw(g2);
        Target target6=new Target(800,800,2.5,2.5);
        target6.draw(g2);
        Target target8=new Target(800,800,1,1);
        target8.draw(g2);
    }

}
