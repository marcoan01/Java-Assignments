import java.util.Scanner;
/**
 * Description: This is the driver that will execute the conversion from english to morse code
 * Class: Fall - COSC 81003
 * Assignment9: Converter
 * Date: 11/13/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class ConverterDemo
{
    /** 
     * Desciption: This is the main method that will read a string from the user, call the constructor sending that string as an argument and then will call the methods to convert the string into an array and compare it to make it morse code
     * @param args as String
     * @return nothing
     * @throws nothing
     */
    public static void main(String args[])
    {
        
        Scanner keyboard = new Scanner(System.in);
        String user = new String();
        System.out.println("Enter a message to translate it into morse code. Type any letter, number, question mark, period, comma or whitespace");
        user = keyboard.nextLine();
        user = user.toLowerCase();
        Converter conv = new Converter(user);
        conv.setArray(user);
        conv.Compare();
    }
}