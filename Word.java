/**
Description: This program will ask the user to input some personal information in order to print a story based on that information
*Class: Fall - COSC 1437.81003
*Assignment3: Word Game
*Date: 09/11/2018
@author Marco Delgado
@version 1.0.0
*/
/**
@param String it will print all the information entered alongside with a story.
@return nothing
@throws nothing
*/
import java.util.Scanner;
public class Word
{
    public static void main (String args[])
    {
    String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petname;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("What is your name?  " );
		
		name = keyboard.nextLine();
		
		System.out.print("What is your age?  " );
		
		age = keyboard.nextInt();

		keyboard.nextLine();

		System.out.print("Where do you live?  " );

		city = keyboard.nextLine();

		System.out.print("What college did you go to?  " );
		
		college = keyboard.nextLine();

		System.out.print("What is your profession? ");
		
		profession = keyboard.nextLine();
		
		System.out.print("What kind of animal do you have?" );

		animal = keyboard.nextLine();

		System.out.print("What is its name?  " );

		petname = keyboard.nextLine();

		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petname + ". They both lived happily ever after!");
    
    }    

}