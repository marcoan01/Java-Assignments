/**
 * Description: This class will simulate a converter that translates from english to morse code
 * Class: Fall - COSC 81003
 * Assignment9: Converter
 * Date: 11/13/2018
 * @author Marco Delgado
 * @version 1.0.1
 */
public class Converter
{
    private String [] morse = {" ", "--..--", ".-.-.", "..--..",
                               "-----", ".----", "..---", "...--",
                               "....-", ".....", "-....", "--...",
                               "---..", "----.", ".-", "-...", "-.-.",
                               "-..", ".", "..-.","--.","....","..", 
                               ".---","-.-",".-..","--","-.","---",
                               ".--.","--.-",".-.","...","-","..-",
                               "...-",".--","-..-","-.--","--.."};
    private char [] letter = {' ', ',','.','?','0','1','2','3','4','5',
                              '6','7','8','9','a','b','c','d','e','f',
                              'g','h','i','j','k','l','m','n','o','p',
                              'q','r','s','t','u','v','w','x','y','z'};
                               

    private String msg;
    private char [] pieces;
    /**
     * Description: This is the constructor that will accept a String as an argument and then set it to the msg variable from this class
     * @param str as String
     * @return nothing
     * @throws nothing
     */
    public Converter(String str)
    {
        str = msg;
        

    }
    /**
     * Description: This method will take every element from array converted from the String and will compare each element in order to print the results
     * @param nothing
     * @return nothing
     * @throws nothing
     */
    public void Compare()
    {
        for( int i = 0; i < pieces.length; i++)
        {
            if(Character.isDigit(pieces[i]) || Character.isLetter(pieces[i]) || Character.isSpaceChar(pieces[i]) || pieces[i] == ',' || pieces[i] == '?' || pieces[i] == '.')
            {
            for( int j = 0; j < morse.length; j++)
            {
                if (pieces[i] == letter[j])
                    System.out.print(morse[j]);
                
            }
        }
            else
            {
                System.out.println("Invalid input (Any character different from a digit, letter, whitespace, comma, period or question mark is not valid)");
            }
        }
    }
    /**
     * Description: This method will convert the string from the user into an array
     * @param str as String
     * @return nothing
     * @throws nothing
     */
    public void setArray(String str)
    {
        pieces = str.toCharArray();
        
    }
    
}