package hw3;
//Question 4.30

import java.io.*;
public class Palindromes
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        String reverse = "";
        int counter;
        
        System.out.println("Please enter a five integers number: ");
        str = kb.readLine();
        
        while(!(str.length() == 5)) 
        {
            System.out.println("That was not correct, try again");
            str = kb.readLine();
        }
        
        counter = str.length(); 
        
        while(counter >= 1)
        {
            reverse = reverse + str.substring(counter-1, counter);
            counter --;
        }

        if(Integer.parseInt(reverse) == Integer.parseInt(str))
        {
            System.out.println("This number is a palindrome!");   
        }
        else
        {
            System.out.println("This number is not a palindrome!");
        }
    }

}
