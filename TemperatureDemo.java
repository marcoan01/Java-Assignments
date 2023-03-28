import java.util.Scanner;
/**
 * Description: This program will calculate the temperature in celsius and kelvin based on the fahrenheit temperature given by the user
 * Class: Fall COSC 1437.81003
 * Assignment4: Temperature
 * Date: 09/20/2018
 * @author Marco Delgado
 * @version 1.0.2
 */
public class TemperatureDemo{
    /**
     * Description: This method will get the temperature, and print the results
     * @param String as args
     * @return nothing
     * @throw nothing
     */
    public static void main(String args[]){
    double far;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the temperature in Farenheit units: ");
    far = keyboard.nextDouble();
    Temperature tem = new Temperature(far);
    System.out.printf("The temperature in Celsius is : %.1f\n ", tem.getCelsius());
    System.out.printf("The temperature in Kelvin is: %.1f\n ", tem.getKelvin());
    }

}
