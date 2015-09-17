

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testFillUp()
    {
        VendingMachine pepsi= new VendingMachine(15);
        pepsi.fillUp(20);
        assertEquals(35,pepsi.getCans(),1e-6);
    }
    @Test
    public void testInsertToken()
    {
        VendingMachine coke= new VendingMachine(15);
        coke.insertToken();
        assertEquals(1,coke.getTokens(),1e-6);
        assertEquals(1,coke.getUncreditedTokens(),1e-6);
    }
    @Test
    public void testDispense()
    {
        VendingMachine rcCola= new VendingMachine(15);
        rcCola.insertToken();
        assertEquals(1,rcCola.getTokens(),1e-6);
        assertEquals(1,rcCola.getUncreditedTokens(),1e-6);
        rcCola.dispense();
        assertEquals(1,rcCola.getTokens(),1e-6);
        assertEquals(0,rcCola.getUncreditedTokens(),1e-6);
        assertEquals(14,rcCola.getCans(),1e-6);
    }
}
