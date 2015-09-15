

/**
 *A big box of lovely drinks.
 * 
 * @author Austin Lynch
 * @version 9/15/2015
 */
public class VendingMachine
{
    /** number of tokens IN  the machine */
    private int tokens;
    /** number of cans IN  the machine */
    private int cans;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans)
    {
        this.cans=cans;
        this.tokens = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void fillUp(int newCans)
    {
        this.cans+=newCans;
    }

}
