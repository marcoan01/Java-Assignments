/**
 * Description: This is the driver that will simulate the odometer and the fuelgague together
 * Class: Fall - COSC 1437-81003
 * Assignment7: Car instrument simulator
 * Date: 10/23/2018
 * @author Marco Delgado
 * @version 1.0.2
 */
public class CarSimulation{
    /**
     * This main method will create two objects. Fill up the gas tank and a driving car simulation
     * @param args as String
     * @return nothing
     * @throws nothing
     * 
     */
    public static void main(String args[]){
    
        FuelGauge fuel = new FuelGauge();
        Odometer od = new Odometer(0, fuel);
        
        //filling up the gas tank
        for (int i = 0; i < fuel.maxgallons; i++)
        {
            fuel.increment();
        }
        while (fuel.getFuel() > 0){
        od.IncrementMiles();
        System.out.println("There are " + fuel.getFuel() + " gallons ");
        System.out.println(od.getMiles() + " miles "  + " have been driven ");
        
        if (fuel.getFuel() == 0)
        {
            System.out.println("\n\nYou ran out of fuel :(");
        }
        }
    }

}