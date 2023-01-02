//Question 2.26
import java.io.*;
public class Multiple
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int nbr1;
        int nbr2;

        System.out.println("Enter the first number: ");
        nbr1 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the second number: ");
        nbr2 = Integer.parseInt(kb.readLine());
        
        if(nbr1 % nbr2 == 0)
            System.out.println(nbr1 + " is a multiple of " + nbr2);
        else
            System.out.println(nbr1 + " is not a multiple of " + nbr2);
    }

}
