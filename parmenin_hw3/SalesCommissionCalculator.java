package hw3;

//Question 4.19

import java.io.*;

public class SalesCommissionCalculator
{
    public static void main(String [] args) throws IOException 
    {
        double earnings = 200.0;
        double grossSales = 0.0;
        double commission;
        
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter weekly sales or -1 to quit: ");
        double itemValue = Double.parseDouble(kb.readLine());
        
        while(itemValue != -1) 
        {
            grossSales = grossSales + itemValue;
            
            System.out.print("Enter weekly sales or -1 to quit: ");
            itemValue = Double.parseDouble(kb.readLine());
        }
        
//        Calculating the gross sales
        commission = grossSales * 0.09;
        System.out.println("The total earnings are: " + (earnings + commission));
        
    }

}