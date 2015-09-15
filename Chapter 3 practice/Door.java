

/**
 * It's a door. It just kinda hangs out...
 * 
 * @author Austin Lynch
 * @version 9/15/2015
 */
public class Door
{
    /** The name defining the door */
    private String name;
    /** Defines if the door is open or closed */
    private String state;

    /**
     * Default constructor for objects of class Door
     */
    public Door(String name,String state)
    {
        this.name = name;
        this.state=state;
    }

    /**
     * Opens the door
     *
     * @pre        The door's current state must be closed
     */
    public void open()
    {
        this.state="open";
    }
    
     /**
     * Closes the door
     *
     * @pre        The door's current state must be open
     */
    public void closed()
    {
        this.state="closed";
    }
    
     /**
     * Returns the name of the door
     *
     * @return returns the name of the door.
     */
    public String getName()
    {
        return this.name;
    }
    
     /**
     * Returns if the door is open or closed
     *
     * @return returns if the door is open or closed.
     */
    public String getState()
    {
        return this.state;
    }
    
        /**
     *Changes the name of the door.
     *
     * @param newName the new name of your door.
     */
    public void setName(String newName)
    {
        this.state=newName;
    }
    
     /**
     * Changes the state of the door.
     *
     *@param newState the new name of your door
     */
    public void setState(String newState)
    {
        this.state="closed";
    }

}
