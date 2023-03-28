/**
 * Description: This class will simulate the player by creating two dice
 * Class: Fall - COSC1437 - 81003
 * Assignment 6: A Game of Twenty One
 * Date: 10/11/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class Game 
{
    private int value1;
    private int value2;
    private int total;
    /**
     * Description: This method will create two instances from the die class, call the roll method, assign their values to the variables and accumulate the points
     * @param nothing
     * @return nothing
     * @throws nothing
     */
   public void rolling()
    {
    Die die1 = new Die(6);
    Die die2 = new Die(6);
    
    die1.roll();
    die2.roll();
    
    value1 = die1.getValue();
    value2 = die2.getValue();
    
    total = total + (value1 + value2);
    }
    /**
     * Description: This method will return the value of the total variable
     * @param nothing
     * @return total as an integer
     * @throws nothing
     */
    public int getTotal()
    {
        return total;
    }
}
