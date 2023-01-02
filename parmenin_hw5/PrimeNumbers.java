//Question 6.25

public class PrimeNumbers {

    // Method to check prime number using n/2
    public boolean isPrime(int number) {

        // Dividing all the +ve numbers equal to or less than the half of the given
        // number, to it starting at 2
        for (int i = 2; i <= number / 2; i++) {
            // Checking if the number is not divisible by any other number
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // C) Using the square root to check prime numbers
    public boolean isPrime2(int number) {

        // Calculating the square root
        int sRoot = (int) Math.sqrt(number);

        for (int i = 2; i <= sRoot; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // B) Displaying all prime numbers less than 10,000
    public static void main(String[] args) {

        PrimeNumbers pnbr = new PrimeNumbers(); // Instantiating an object of this class - BAD DESIGN - DO NOT DO IT IN SAME CLASS
        int number, number2, counter = 0, counter2 = 0;

        // Checking if i prime using the n/2
        for (number = 2; number < 10000; number++) {
            if (pnbr.isPrime(number)) { // SHOULD BE STATIC
                counter++;
                System.out.println(number);
            }
        }

        System.out.println("Using the n/2, there are " + counter + " prime numbers up to 10000!\n");

        // C) Checking if i prime using the square root
        for (number2 = 2; number2 < 10000; number2++) {
            if (pnbr.isPrime2(number2)) {// SHOULD BE STATIC
                counter2++;
                System.out.println(number2);
            }
        }

        System.out.println("Using the square root, there are " + counter2 + " prime numbers up to 10000!\n");
    }

}
