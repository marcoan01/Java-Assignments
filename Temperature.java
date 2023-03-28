/**
 * Description: This program will calculate the temperature in celsius and kelvin based on the fahrenheit temperature given by the user.
 * Class: Fall COSC 1437.81003
 * Assignment4: Temperature
 * Date: 09/20/2018
 * @author Marco Delgado
 * @version 1.0.2
 */
public class Temperature{

    private double ftemp;
    /**
     * Description: This is the constructor that will assign the value temp into ftemp
     * @param temp as double
     * @return nothing
     * @throw nothing
     */
    Temperature(double temp){
    
        ftemp = temp;
    } 
    /**
     * Description: This method will set the variable temp into the variable ftemp
     * @param temp as double
     * @return nothing
     * @throw nothing
     */
    public void setFahrenheit(double temp){
        temp = ftemp;
    }
    /**
     * Description: This method will return value of the fahrenheit units
     * @param nothing
     * @return fahrenheit
     * @throw nothing
     */
    public double getFahrenheit(){
        return ftemp;
    }
    /**
     * Description: This method will return value of the celsius units
     * @param nothing
     * @return celsius
     * @throw nothing
     */
    public double getCelsius(){
        return ((ftemp - 32)*5)/9;
     }
    /**
     * Description: This method will return value of the kelvin units
     * @param nothing
     * @return kelvin
     * @throw nothing
     */
     public double getKelvin(){
        return (((ftemp - 32)*5)/9) + 273;
    }
}
