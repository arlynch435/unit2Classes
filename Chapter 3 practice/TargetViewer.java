import javax.swing.JFrame;

/**
 * sets up the window for the target to be placed.
 * 
 * @author Austin Lynch 
 * @version 9/21/15
 */
public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame= new JFrame();
        frame.setSize(1600,1600);
        frame.setTitle("Targets!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TargetComponent component= new TargetComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
