// Question 6.31

import java.util.Random;
import java.io.*;

public class NumberModification {

    public static void play() throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int choosenNumber;
        int aGuess;

        Random rnd = new Random();
        choosenNumber = rnd.nextInt(1, 1001);

        System.out.println("Guess a number between 1 and 1000");
        aGuess = Integer.parseInt(kb.readLine());

        for (int guesses = 1; guesses <= 10; guesses++) {
            if (aGuess > choosenNumber) {
                System.out.println("Too high. Try again.");
                aGuess = Integer.parseInt(kb.readLine());
            }

            else if (aGuess < choosenNumber) {
                System.out.println("Too low. Try again.");
                aGuess = Integer.parseInt(kb.readLine());
            }
        }

        if (aGuess == choosenNumber) {
            System.out.println("Aha! You know the secret!");
        }

        else if (aGuess != choosenNumber) {
            System.out.println("You should be able to do better!");
        }
    }

    public static void main(String[] args) throws IOException {
        play();

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter y/yes/enter/space to play again, or otherwise to exit!");
        String sentnl = kb.readLine();

        while (sentnl.trim().isEmpty() || sentnl.equalsIgnoreCase("y") || sentnl.equalsIgnoreCase("yes")) {
            play();
            System.out.println("\nEnter y/yes/enter/space to play again, or otherwise to exit!");
            sentnl = kb.readLine();
        }
        System.out.println("Exiting...  Bye!");
    }
}
