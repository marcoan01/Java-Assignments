/**
 * Description: This class will simulate the odometer of a car
 * Class: Fall - COSC 1437-81003
 * Assignment7: Car instrument simulator
 * Date: 10/23/2018
 * @author Marco Delgado
 * @version 1.0.2
 */
public class Odometer 
{
    public final int maxmileage = 999999;
    public final int mpg = 24;
    private int miles;
    private int initial;
    private FuelGauge fuelgauge;
    
    /**
     * This is a constructor that will pass miles and an object of FuelGauge class as arguments
     * @param miles as an int, and a FuelGauge object called fuelgauge
     * @return nothing
     * @throws nothing
     */
    public Odometer(int miles, FuelGauge fuelgauge)
    {
        this.initial = miles;
        this.fuelgauge = fuelgauge;
        
    }
    /**
     * This method will increment the miles until it hits the maximum. It will also decrement the fuel every 24 mmiles
     * @param nothing
     * @return nothing
     * @throws nothing
     */
    public void IncrementMiles()
    {
        int driven = initial - miles;
        if (miles < maxmileage)
            miles++;
        else 
            miles = 0;
        if(miles % mpg == 0)
        {
            fuelgauge.decrement();
        }
    }
    /**
     * This method will return the value of the current miles
     * @param nothing
     * @return miles
     * @throws nothing
     */
    public int getMiles()
    {
        return miles;
    }
}