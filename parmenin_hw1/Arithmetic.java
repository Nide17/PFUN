//Question 2.17
import java.io.*;

public class Arithmetic
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int nbr1;
        int nbr2;
        int nbr3;

        System.out.println("Enter the first number: ");
        nbr1 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the second number: ");
        nbr2 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the third number: ");
        nbr3 = Integer.parseInt(kb.readLine());
        
        System.out.println("The sum is: " + (nbr1 + nbr2 + nbr3));
        System.out.println("The average is: " + (nbr1 + nbr2 + nbr3)/3);
        System.out.println("The product is: " + (nbr1 * nbr2 * nbr3));
        
        if(nbr1 >= nbr2 && nbr1 >= nbr3)
            System.out.println(nbr1 + " is the largest!");
        
        if(nbr1 <= nbr2 && nbr1 <= nbr3)
            System.out.println(nbr1 + " is the smallest!");
        
        
        if(nbr2 >= nbr1 && nbr2 >= nbr3)
            System.out.println(nbr2 + " is the largest!");
        
        if(nbr2 <= nbr1 && nbr2 <= nbr3)
            System.out.println(nbr2 + " is the smallest!");
        
        
        if(nbr3 >= nbr1 && nbr3 >= nbr2)
            System.out.println(nbr3 + " is the largest!");
        
        if(nbr3 <= nbr1 && nbr3 <= nbr2)
            System.out.println(nbr3 + " is the smallest!");

    }

}
