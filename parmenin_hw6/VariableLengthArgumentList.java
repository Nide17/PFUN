//Question 7.14
public class VariableLengthArgumentList {

    // Method to do the product
    public static int product(int... nbrs) {
        int result = 1;
        for (int nbr : nbrs) {
            result *= nbr;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 10, b = 5, c = 8, d = 50, e = 0;

        // Displaying the results
        System.out.println("The product of " + a + ", and " + d + " is " + product(a, d));
        System.out.println("The product of " + a + ", " + b + ", and " + c + " is " + product(a, b, c));
        System.out.println("The product of " + a + ", " + d + ", " + b + ", and " + c + " is " + product(a, d, b, c));
        System.out.println("The product of " + a + ", " + b + ", " + c + ", " + d + ", and " + e + " is "
                + product(a, b, c, d, e));
    }

}
