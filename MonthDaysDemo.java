import java.util.Scanner;
/**
 * Description: This program will return the number of days depending on the month and whether the year is leap or not
 * Class: Fall - COSC 1437 - 81003
 * Assignment5: MonthDaysDemo
 * Date: 10/01/2018
 * @author Marco Delgado
 * @version 1.0.2
 */
public class MonthDaysDemo
{
    /**
     * This is the main method that will get the values from the user and then create an object that will call the getNumberOfDays method
     * @param String as args
     * @return nothing
     * @throws nothing
     */
    
    public static void main(String args[])
    {
        int month;
        int year;
     
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a month: ");
        month = keyboard.nextInt();
        System.out.println("Enter a year: ");
        year = keyboard.nextInt();
        MonthDays mon = new MonthDays(month, year);
        System.out.println(mon.getNumberOfDays() + " days ");
    
    }



}
