

/**
 *A big box of lovely drinks.
 * 
 * @author Austin Lynch
 * @version 9/15/2015
 */
public class VendingMachine
{
    /** number of TOTAL tokens IN  the machine */
    private int tokens;
    /**number of tokens that has not been credited*/
    private int uncreditedTokens;
    /** number of cans IN  the machine */
    private int cans;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans)
    {
        this.cans=cans;
        this.tokens = 0;
        this.uncreditedTokens=0;
    }

    /**
     * Adds cans to the total number of cans in the machine.
     * @param    newCans    The number of cans being added to the vending machine.
     */
    public void fillUp(int newCans)
    {
        this.cans+=newCans;
    }
    
     /**
     * Puts a singular token into the machine.
     */
    public void insertToken()
    {
        this.tokens+=1;
        this.uncreditedTokens+=1;
    }
    
    /**
     * Takes one uncredited token and dispenses a can out of the machine.
     * @pre The machine must have at least one uncredited token and at least one can in the machine
     */
    public void dispense()
    {
        this.uncreditedTokens-=1;
        this.cans-=1;
    }

    /**
     * Returns how many cans are in the machine.
     * @return returns the number of cans in the machine.
     */
    public int getCans()
    {
        return this.cans;
    }
    
     /**
     * Returns how many tokens have not been taken for credit
     * @return returns the number of tokens not credited but in the machine.
     */
    public int getUncreditedTokens()
    {
        return this.uncreditedTokens;
    }
    
    /**
     * returns the TOTAL number of tokens in the machine.
     * @return returns the TOTAL number of tokens in the machine.
     */
    public int getTokens()
    {
        return this.tokens;
    }
}
