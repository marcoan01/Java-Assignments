/**
 * Description: This program will call the acceleration and the brakes of a car 5 times and then, it will print value of the speed.
 * Class: Fall COSC 1437.81003
 * Assignment4: Car
 * Date: 09/20/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class CarDemo{
    /**
     * Description: This method will create an instance of the class Car, and then print the acceleration and the brakes values
     * @param String as args
     * @return nothing
     * @throw nothing
     */
    public static void main(String args[]){
    
    Car automobile = new Car(2018, "Honda");
    automobile.Accelerate();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Accelerate();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Accelerate();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Accelerate();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Accelerate();
    System.out.println("The current speed is " + automobile.getSpeed());
    System.out.println("\nAfter the brakes have been pressed");
    automobile.Brake();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Brake();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Brake();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Brake();
    System.out.println("The current speed is " + automobile.getSpeed());
    automobile.Brake();
    System.out.println("The current speed is " + automobile.getSpeed());
}
}
