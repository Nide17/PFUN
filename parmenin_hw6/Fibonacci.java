
//Question 7.29
import java.io.*;

public class Fibonacci {

    // method that calculates nth fibonacci number
    public static void fibonacci(int n) {
        // Array for the series
        int seriesArray[] = new int[n + 2];

        // Beginning with terms 0 and 1 in the array
        seriesArray[0] = 0;
        seriesArray[1] = 1;

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                // Calculating the current value by adding the previous two values
                seriesArray[i] = seriesArray[i - 1] + seriesArray[i - 2];
            }

            // a) Printing n fibonacci numbers
            for (int i = 0; i < n; i++) {
                System.out.print(seriesArray[i] + " ");
            }

            // b) largest fibonacci number
            System.out.print("\nb)The largest fibonacci integer of the input is: " + seriesArray[n - 1]);
        }

        else {
            if (n == 0) {
                System.out.print(seriesArray[0]);
                System.out.print("\nb)The largest fibonacci integer of the input is: " + seriesArray[0]);
            }

            else {
                for (int i = 0; i <= n; i++) {
                    System.out.print(seriesArray[i] + " ");
                }
                System.out.print("\nb)The largest fibonacci integer of the input is: " + seriesArray[n]);
            }
        }
    }

    // Double
    // c) method that calculates nth fibonacci number using doubles
    public static void fibonacci2(double n) {
        // Array for the series
        double seriesArray[] = new double[(int) (n + 2)];

        // Beginning with terms 0 and 1 in the array
        seriesArray[0] = 0.0;
        seriesArray[1] = 1.0;

        if (n > 1.0) {
            for (int i = 2; i <= n; i++) {
                // Calculating the current value by adding the previous two values
                seriesArray[i] = seriesArray[i - 1] + seriesArray[i - 2];
            }

            // a) Printing n fibonacci numbers
            for (int i = 0; i < (int) n; i++) {
                System.out.print(seriesArray[i] + " ");
            }

            // b) largest fibonacci number
            System.out.print("\nb)The largest fibonacci double of the input is: " + seriesArray[(int) (n - 1)]);

        }

        else {
            if (n == 0.0) {
                System.out.print(seriesArray[0]);
                System.out.print("\nb)The largest fibonacci integer of the input is: " + seriesArray[0]);
            }

            else {
                for (int i = 0; i <= (int) n; i++) {
                    System.out.print(seriesArray[i] + " ");
                }
                System.out.print("\nb)The largest fibonacci integer of the input is: " + seriesArray[(int) n]);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter an integer number to calculate the fibonacci number:");
            fibonacci(Integer.parseInt(kb.readLine()));
        }

        catch (Exception e) {
            System.out.println("Please check your inputs! They must be integers");
        }

        // Double
        try {
            // c
            BufferedReader kbDouble = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nPlease enter a double number to calculate the fibonacci number:");
            fibonacci2(Double.parseDouble(kbDouble.readLine()));
        }

        catch (Exception e) {
            System.out.println("Please check your inputs! They must be doubles");
        }

    }

}