/**
 * Description: This program will call the acceleration and the brakes of a car 5 times and then, it will print value of the speed.
 * Class: Fall COSC 1437.81003
 * Assignment4: Car
 * Date: 09/20/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class Car{
    
private int yearModel;
private int speed;
private String make;
/**
     * Description: This is the constructor that will assign the parameters Model and CarMake into the main method.
     * @param Model as int and CarMake as String
     * @return nothing
     * @throw nothing
     */
public Car(int Model, String CarMake)
{
   yearModel = Model;
   make = CarMake;
   speed = 0;
}
/**
     * Description: This method will return value of the year model
     * @param nothing
     * @return yearModel
     * @throw nothing
     */
public int getYearModel(){
    return yearModel;
}
/**
     * Description: This method will return value of the current speed
     * @param nothing
     * @return speed
     * @throw nothing
     */
public int getSpeed(){
    return speed;
}
/**
     * Description: This method will return value of the make variable
     * @param nothing
     * @return make
     * @throw nothing
     */
public String getMake(){
    return make;
}
/**
     * Description: This method will add 5 units to the speed variable as it is called
     * @param nothing
     * @return nothing
     * @throw nothing
     */
public void Accelerate()
{
    speed = speed + 5;
}
/**
     * Description: This method will substrack 5 units to the speed variable as it is called.
     * @param nothing
     * @return nothing
     * @throw nothing
     */
public void Brake()
{
    speed = speed - 5;
}
}
