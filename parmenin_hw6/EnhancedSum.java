// Question 7.16

public class EnhancedSum {

    public static void main(String args[]) {
        double sum = 0;

        // Checking if arguments are supplied
        if (args.length > 0) {
            try {
                for (String db : args) {
                    sum += Double.parseDouble(db);
                }

                System.out.println("The sum of passed numbers is " + sum);
            }

            // Catching exceptions from the invalid inputs
            catch (Exception e) {
                System.out.println("Please check your inputs! They must be numbers");
            }
        }

        // When no arguments are supplied
        else {
            System.out.println("Insufficient numbers to do the sum");
        }

    }
}
