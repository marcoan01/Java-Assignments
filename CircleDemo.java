import java.util.Scanner;
/**
 * Description: This program will calculate the area, diameter and the circumference of the radius given by the user.
 * Class: Fall COSC 1437.81003
 * Assignment4: Circle
 * Date: 09/20/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class CircleDemo{
    /**
     * Description: This method will get the radius from the user, then it will print the results.
     * @param String as args
     * @return nothing
     * @throw nothing
     */
    public static void main(String args[]){
    
    double circrad;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    circrad = keyboard.nextDouble();
    Circle circ = new Circle(circrad);
    System.out.println("The radius of the circle is : " + circrad);
    System.out.printf("The area of the circle is: %.1f\n", circ.getArea());
    System.out.printf("The diameter of the circle is: %.1f\n", circ.getDiameter());
    System.out.printf("The circumference of the circle is: %.1f\n", circ.getCircumference());
    }
    
}
