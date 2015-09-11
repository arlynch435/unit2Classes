

/**
 * A car has a certain fuel efficiency and a c3ertain amount of fuel in the gas tank.
 * The car may be driven which reduces the amount of gas in the fuel tank
 * @author Austin 
 * @version (10 September 2015)
 */
public class Car
{
    /** the fuel efficiency for the car measured in units of miles/gallon (mpg) */
    private double fuelEfficiency;
    /**the amount of fuel in the tank of the car measured in units of gallons */
    private double fuelInTank;
    /**
     * Constructor for objects of class Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        fuelEfficiency=fuelEfficiency;
        fuelInTank=0;
    }

    /**
     * Simulates driving the car for the specified distance and reduces the amount of gas in the fuel tank.
     *    
     *
     * @pre        The specified distance will not consume more than the available gas
     * @param    distance    the specified distance to drive in units of miles
     */
    public void drive(double distance)
    {
        fuelInTank -= distance / fuelEfficiency;

    }
    
    /**
     * Returns the number of gallons of gas in the car's tank.
     *
     * @return  the number of gallons of gas in the car's tank.
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }

    /**
     * Increments gas to the total gas in the car in units of gallons.
     *
     * @pre     gallonsOfGas must be postitive
     * @param   gallonsOfGas   amount of gas being added to the car.
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank+=gallonsOfGas;
    }

}