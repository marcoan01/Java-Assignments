/**
 * Description: This class will simulate the fuelguage of a car
 * Class: Fall - COSC 1437-81003
 * Assignment7: Car instrument simulator
 * Date: 10/23/2018
 * @author Marco Delgado
 * @version 1.0.2
 */
public class FuelGauge
{
    private int fuel;
    public final int maxgallons = 15;
    
    /**
     * This a constructor that will pass fuel as an argument and assing its value
     * @param fuel as in integer
     * @return nothing
     * @throws nothing
     */
    public FuelGauge(int fuel)
    {
        if (fuel <= maxgallons)
            this.fuel = fuel;
        else
            fuel = maxgallons;
    }
    /**
     * This no-arg constructor will assign fuel to 0
     * @param nothing
     * @return nothing
     * @throws nothing
     */
    public FuelGauge()
    {
        fuel = 0;
    }
    /**
     * This method will return the value of the current fuel
     * @param nothing
     * @return fuel
     * @throws nothing
     */
    public int getFuel()
    {
        return fuel;
    }
    /**
     * This method will increment the value of fuel by 1 until it hits the max gallons
     * @param nothing
     * @return nothing
     * @throws nothing
     */
    public void increment()
    {
    if (fuel < maxgallons)
        {
            fuel++;
        }
    
    }
    /**
     * This method will decrement the value of fuel as long as it is more than 0
     * @param nothing
     * @return nothing
     * @throws nothing
     */
    public void decrement()
    {
    if (fuel > 0)
        fuel--;
    else
        System.out.println("The car ran out of fuel");
    }
}
