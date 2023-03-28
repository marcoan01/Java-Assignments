import java.util.Scanner;
import java.io.*;
/**
 * Description: This is the driver that will simulate the game
 * Class: Fall - COSC1437 - 81003
 * Assignment 6: A Game of Twenty One
 * Date: 10/11/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class GameDemo
{
    /**
     * Description: This is the main method that will simulate the game by using the Die and Game classes and will use input and output files
     * @param args as String
     * @return nothing
     * @throws IOException
     */
    public static void main(String args[]) throws IOException
    {
        char decision = 'y';
        Scanner keyboard = new Scanner(System.in);
        PrintWriter outputFile = new PrintWriter("output.txt");
        
        File file = new File("input.txt");
        Scanner inputFile = new Scanner(file);
        String line = inputFile.nextLine();
        System.out.println(line);
        inputFile.close();
        Game user = new Game();
        Game computer = new Game();
        
        
        while(decision == 'y' && user.getTotal() <= 21 && computer.getTotal() <= 21)
        {
            computer.rolling();
            System.out.println("Do you want to roll the dice? (type 'yes' or 'no' in lowercase)");
            decision = keyboard.nextLine().charAt(0);
            if (decision == 'y')
            {
                user.rolling();
                System.out.println("You rolled " + user.getTotal());
                outputFile.println("You rolled " + user.getTotal());
            }
        
        }
        System.out.println("The computer rolled " + computer.getTotal());
        outputFile.println("The computer rolled " + computer.getTotal());
        if (user.getTotal() > 21 && computer.getTotal() <= 21)
        {
            System.out.println("You lost!");
            outputFile.println("You lost!");
        }
        else if (computer.getTotal() > 21 && user.getTotal() <= 21)
        {
            System.out.println("You won!");
            outputFile.println("You won!");
        }
        else if (computer.getTotal() == user.getTotal())
        {
            System.out.println("It is a tie!");
            outputFile.println("It is a tie!");
        }
        else if (user.getTotal() > 21 && computer.getTotal() >21)
        {
            System.out.println("Nobody won :(");
            outputFile.println("Nobody won :(");
        }
        else if (user.getTotal() > computer.getTotal() && user.getTotal() <= 21 && computer.getTotal() >21)
        {
            System.out.println("You won!");
            outputFile.println("You won!");
        }
        else 
            System.out.println("You lost!");
        outputFile.close();
        System.out.println("Inside of the folder of this class, an output text file has been created for you to see the results of the game!");
    }
    


}
