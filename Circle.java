/**
 * Description: This program will calculate the area, diameter and the circumference of the radius given by the user.
 * Class: Fall COSC 1437.81003
 * Assignment4: Circle
 * Date: 09/20/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class Circle{

    private double radius;
    private final double PI = 3.14159;
    /**
     * Description: This is the constructor that will assign variables to the driver
     * @param rad as a double
     * @return nothing
     * @throw nothing
     */
    public Circle(double rad)
    {
        radius = rad;
    }
    /**
     * Description: This method set the variable radius equals to rad
     * @param rad as double
     * @return nothing
     * @throw nothing
     */
    public void setRadius(double rad){
        radius = rad;
    }
    /**
     * Description: This method will return value of the radius
     * @param nothing
     * @return radius
     * @throw nothing
     */
    public double getRadius(){
        return radius;
    }
    /**
     * Description: This method will return value of the area
     * @param nothing
     * @return area
     * @throw nothing
     */
    public double getArea(){
        return PI * radius * radius;
    }
    /**
     * Description: This method will return value of the diameter
     * @param nothing
     * @return diameter
     * @throw nothing
     */
    public double getDiameter(){
        return radius * 2;
    }
    /**
     * Description: This method will return value of the circumference
     * @param nothing
     * @return circumference
     * @throw nothing
     */
    public double getCircumference(){
        return PI * 2 * radius;
    }
}
