import java.util.Random;
/**
 * Description: This class will simulate a Die
 * Class: Fall - COSC1437 - 81003
 * Assignment 6: A Game of Twenty One
 * Date: 10/11/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class Die
{
private int sides;
private int value;
/**
 * Description: This is the constructor that will accept the number of sides as an argument and then call the roll method
 * @param numSides as an integer
 * @return nothing
 * @throws nothing
 */
public Die(int numSides)
{
   sides = numSides;
   roll();
}
/**
 * Description: This method will generate a random number and assign it to the value variable
 * @param nothing
 * @return nothing
 * @throws nothing 
 */
public void roll()
{
    Random rand = new Random();
    value = rand.nextInt(sides) + 1;
}
/**
 * Description: This method will return the value
 * @param nothing
 * @return value as an integer
 * @throws nothing
 */
public int getValue()
{
    return value;
}
}
