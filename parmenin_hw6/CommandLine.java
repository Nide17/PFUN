// Question 7.15

public class CommandLine {

    public static void main(String[] args) {
        int[] array;

        // Checking if arguments are supplied
        if (args.length > 0) {
            array = new int[Integer.parseInt(args[0])];
        }

        // Use 10 when no arguments supplied
        else {
            array = new int[10];
        }

        // Printing the output
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

}
