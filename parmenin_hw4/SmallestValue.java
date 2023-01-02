package hw4;

// Question 5.11
// HABIMANA Jean de Dieu
// ISHIMWE Niyomwungeri Parmenide

import java.io.*;

// First number user enters is the counter of the numbers to be entered!
public class SmallestValue
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int smallest = 2147483647; // Largest integer in java
        int number;
        
        System.out.print("Provide the number of integers to compare : ");
        int valuesNbr = Integer.parseInt(kb.readLine());
        
        if(valuesNbr < 1)
        {
            System.out.println("Invalid input!");
        }
        
        else
        {
            System.out.println("You are comparing " + valuesNbr + " integers. \n");
            
            for(int i = 1; i <= valuesNbr; i++) {
                System.out.print("Provide integer " + (i) + ":");
                number = Integer.parseInt(kb.readLine());
                
                if(smallest > number)
                {
                    smallest = number;
                }
            }
            
            System.out.println("\nThe smallest integer is " + smallest);
            
        }

    }

}
