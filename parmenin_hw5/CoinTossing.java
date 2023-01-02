// Question 6.29

import java.io.*;
import java.util.Random;

public class CoinTossing
{
    
    // Coinside enum declaration
    public enum CoinSide
    {
        HEADS,
        TAILS;
    }
    
    // Instance variables
    private CoinSide cSide;
    private int toss;
    private int headsCounter = 0;
    private int tailsCounter = 0;
    
    
    // Getters and Setters
    public CoinSide getcSide()
    {
        return cSide;
    }

    public void setcSide(CoinSide cSide)
    {
        this.cSide = cSide;
    }

    public int getToss()
    {
        return toss;
    }

    public void setToss(int toss)
    {
        this.toss = toss;
    }

    public int getHeadsCounter()
    {
        return headsCounter;
    }

    public void setHeadsCounter(int headsCounter)
    {
        this.headsCounter = headsCounter;
    }

    public int getTailsCounter()
    {
        return tailsCounter;
    }

    public void setTailsCounter(int tailsCounter)
    {
        this.tailsCounter = tailsCounter;
    }
    
    // toString method
    public String toString()
    {
        return "cSide=" + cSide + ", toss=" + toss + ", headsCounter=" + headsCounter + ", tailsCounter="
                + tailsCounter;
    }

    // Generating the sides of the coin randomly and setting the results
    public void flip()
    {
        Random rnd = new Random();
        setToss(rnd.nextInt(2));
        
        if(getToss() == 0)
            setcSide(CoinSide.HEADS);
        else
            setcSide(CoinSide.TAILS);   
    }


    // Counting the results for each coin side
    public void checkCoinSide()
    {
        if(getcSide() == CoinSide.HEADS)
        {
            setHeadsCounter(getHeadsCounter() + 1);
        }
        else
        {
            setTailsCounter(getTailsCounter() + 1);
        }
    }


    public static void main(String[] args) throws IOException
    {
        CoinTossing ctsss = new CoinTossing(); // BAD DESIGN - DON'T INSTANTIATE OBJECT IN THE SAME CLASS
        
        int nbrOfTosses = Integer.parseInt(args[0]);
        
        
        // Tossing the coin number of times given on the command line
        for(int counter = 1; counter <= nbrOfTosses; counter++)
        {
            // Call the flip: tossing and setting results
            ctsss.flip();
            ctsss.checkCoinSide();
        }
        
        System.out.println("Number of heads: " + ctsss.getHeadsCounter());
        System.out.println("Number of tails: " + ctsss.getTailsCounter());
        System.out.println("Bye!");
    }

}
