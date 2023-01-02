
// Question 7.17
import java.util.Random;

public class DiceRolling {

    // This method is used to roll a die
    public static int rollDice() {
        Random rnd = new Random();
        // return rnd.nextInt(1, 7);

        // In case the .nextInt() method is not accepting two arguments, uncomment the
        // following line
        return rnd.nextInt(6) + 1;
    }

    // Roll the first die
    public static int firstDie() {
        int output1 = rollDice();
        return output1;
    }

    // Roll the second die
    public static int secondDie() {
        int output2 = rollDice();
        return output2;
    }

    public static void main(String[] args) {
        int sums[] = new int[13]; // The array to keep track of counts for each sum of the two outputs
        int rollSum; // The sum of the two outputs
        int finalSum = 0; // The number of times the dice are rolled

        // Rolling the two dice together 36000000 times
        for (int rollCount = 1; rollCount <= 36000000; rollCount++) {
            rollSum = firstDie() + secondDie();

            // Incrementing the counter for each individual output sum
            for (int sumIndex = 2; sumIndex <= 12; sumIndex++)
                if (rollSum == sumIndex) {
                    sums[sumIndex] += 1;
                }
        }

        // Printing the outputs for each individual sum of outputs
        for (int i = 2; i <= 12; i++) {
            System.out.println("The sum equal to " + i + " is " + sums[i]);
            finalSum += sums[i]; // counting the number of dice rolled together
        }

        // Displaying the number dice were rolled
        System.out.println("\nThe dice rolled " + finalSum + " times");
    }
}
