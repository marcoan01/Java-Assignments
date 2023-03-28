/**
 * Description: This program will return the number of days depending on the month and whether the year is leap or not
 * Class: Fall - COSC 1437 - 81003
 * Assignment5: MonthDays
 * Date: 10/01/2018
 * @author Marco Delgadp
 * @version 1.0.2
 */

public class MonthDays
{
    private int month;
    private int year;
    

    /**
     * This is the constructor, that will be called when an object is being created
     * @param m and y as integers
     * @return nothing
     * @throws nothing
     */
    MonthDays(int m, int y)
    {
    year = y;
    month = m;
    }
    /**
     * This method will return number of days by using a switch statement depending on the month entered
     * @param nothing
     * @return days 
     * @throws nothing
     */
    public int getNumberOfDays()
    {
        int days = 0;
        switch (month)
        {
        case 1: 
            days = 31;
            break;
        case 2:
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                days = 29;
            }
            else if (year % 4 == 0)
                days = 29;
            else 
                days = 28;
            break;
        case 3:
            days = 31;
            break;
        case 4:
            days = 30;
            break;
        case 5:
            days = 31;
            break;
        case 6:
            days = 30;
            break;
        case 7:
            days = 31;
            break;
        case 8: 
            days = 31;
            break;
        case 9:
            days = 30;
            break;
        case 10:
            days = 31;
            break;
        case 11:
            days = 30;
            break;
        case 12:
            days = 31;
            break;
        }
        return days;
    }
   
}