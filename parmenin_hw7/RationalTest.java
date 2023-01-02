
// Question 8.15
import java.io.*;

public class RationalTest {
    public static void main(String args[]) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        int decPoints;
        int numerator1;
        int numerator2;
        int denominator1;
        int denominator2;

        Rational firstRational;
        Rational secondRational;
        Rational results;

        System.out.print("Input your first numerator: ");
        numerator1 = Integer.parseInt(keyboard.readLine());

        System.out.print("Input your first denominator: ");
        denominator1 = Integer.parseInt(keyboard.readLine());

        firstRational = new Rational(numerator1, denominator1);

        System.out.print("Input your second numerator: ");
        numerator2 = Integer.parseInt(keyboard.readLine());

        System.out.print("Input your second denominator: ");
        denominator2 = Integer.parseInt(keyboard.readLine());

        secondRational = new Rational(numerator2, denominator2);

        System.out.print("Input your decPoints: ");
        decPoints = Integer.parseInt(keyboard.readLine());

        // Choices
        int userChoice = getUserChoice();

        while (userChoice != 5) {
            switch (userChoice) {
                case 1:
                    results = firstRational.adding(secondRational);
                    System.out.printf("first + second = %s = %s\n", results.toString(),
                            results.floatToString(decPoints));
                    break;

                case 2:
                    results = firstRational.subtracting(secondRational);
                    System.out.printf("first - second = %s = %s\n", results.toString(),
                            results.floatToString(decPoints));
                    break;

                case 3:
                    results = firstRational.multiplying(secondRational);
                    System.out.printf("first * second = %s = %s\n", results.toString(),
                            results.floatToString(decPoints));
                    break;

                case 4:
                    results = firstRational.dividing(secondRational);
                    System.out.printf("first / second = %s = %s\n", results.toString(),
                            results.floatToString(decPoints));
                    break;
            }
            userChoice = getUserChoice();
        }
    }

    private static int getUserChoice() throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Press 1 for adding");
        System.out.println("Press 2 for subtracting");
        System.out.println("Press 3 for multiplying");
        System.out.println("Press 4 for dividing");
        System.out.println("Press 5 for exiting");
        System.out.print("Press a number to make a choice ");
        return Integer.parseInt(keyboard.readLine());
    }
}