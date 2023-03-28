/**
Description: This program will calculate a profit based on stocks sold and bought by a customer and their commissions
*Class: Fall - COSC 1437.81003
*Assignment3: Stock
*Date: 09/11/2018
@author Marco Delgado
@version 1.0.5
*/
/**
@param String it will print the commissions and the profit gained
@return nothing
@throws nothing
*/
public class Stock
{
    public static void main (String args[])
    {
    int shares = 1000;
    double stockpaid = 32.87;
    double commission1 = (stockpaid * shares) * 0.02;
    double stocksold = 33.92;
    double commission2 = (stocksold * shares) * 0.02;
    double totalbought = shares * stockpaid;
    double totalsold = shares * stocksold;
    double profit = (totalbought - totalsold + commission1 + commission2);
    System.out.println("Joe purchased " + shares + " shares in Acme softwate per " + stockpaid + " dollars each, making a total of " + totalbought + ". However, Joe paid a commission of " + commission1 + 
    ", which is the 2% of the total amount.\nTwo weeks later, Joe sold the stock for " + totalsold + " dollars. However, he had to pay " + commission2 + " as another commission for selling the stock. At the end of the day, Joe ended up gaining\n " + profit + " dollars. "); 
    }
    
}