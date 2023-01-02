
//Question 2.24
import java.io.*;

public class Compare {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int nbr1;
        int nbr2;
        int nbr3;
        int nbr4;
        int nbr5;

        System.out.println("Enter the first number: ");
        nbr1 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the second number: ");
        nbr2 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the third number: ");
        nbr3 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the fourth number: ");
        nbr4 = Integer.parseInt(kb.readLine());
        System.out.println("Enter the fifth number: ");
        nbr5 = Integer.parseInt(kb.readLine());

        if (nbr1 > nbr2 && nbr1 > nbr3 && nbr1 > nbr4 && nbr1 > nbr5)
            System.out.println(nbr1 + " is the largest!");

        if (nbr1 < nbr2 && nbr1 < nbr3 && nbr1 < nbr4 && nbr1 < nbr5)
            System.out.println(nbr1 + " is the smallest!");

        if (nbr2 > nbr1 && nbr2 > nbr3 && nbr2 > nbr4 && nbr2 > nbr5)
            System.out.println(nbr2 + " is the largest!");

        if (nbr2 < nbr1 && nbr2 < nbr3 && nbr2 < nbr4 && nbr2 < nbr5)
            System.out.println(nbr2 + " is the smallest!");

        if (nbr3 > nbr1 && nbr3 > nbr2 && nbr3 > nbr4 && nbr3 > nbr5)
            System.out.println(nbr3 + " is the largest!");

        if (nbr3 < nbr1 && nbr3 < nbr2 && nbr3 < nbr4 && nbr3 < nbr5)
            System.out.println(nbr3 + " is the smallest!");

        if (nbr4 > nbr1 && nbr4 > nbr2 && nbr4 > nbr3 && nbr4 > nbr5)
            System.out.println(nbr4 + " is the largest!");

        if (nbr4 < nbr1 && nbr4 < nbr2 && nbr4 < nbr3 && nbr4 < nbr5)
            System.out.println(nbr4 + " is the smallest!");

        if (nbr5 > nbr1 && nbr5 > nbr2 && nbr5 > nbr3 && nbr5 > nbr4)
            System.out.println(nbr5 + " is the largest!");

        if (nbr5 < nbr1 && nbr5 < nbr2 && nbr5 < nbr3 && nbr5 < nbr4)
            System.out.println(nbr5 + " is the smallest!");
    }

}
