// Question 4.21 - PSEUDOCODE AND CODES

//PSEUDOCODE
/*
*         
Declare the number
Initialise the counter to 1
Initialise largest to -2147483648

While the counter is less than 10
    Prompt the user to enter a number
    if the number is greater than largest
    Assign the value of the number to largest
    Increment the counter

Print largest

*/

package hw3;
import java.io.*;

public class LargestNumber
{
    public static void main(String [] args) throws IOException {
        int number;
        int counter = 1;
        int largest = -2147483648; // Smallest integer in java
        
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.printf("Please provide 10 numbers!%n%n");
        
        while(counter <= 10) {
            System.out.println("Provide number " + (counter) + ":");
            number = Integer.parseInt(kb.readLine());
            
            if(largest < number)
            {
                largest = number;
            }
            counter ++;
        }
        
        System.out.println("The largest number is: " + largest);
    }
}
