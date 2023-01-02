// Question 11

public class ComplexNumbersTest {
    public static void main(String args[]) {

        ComplexNumbers cNbr1 = new ComplexNumbers(5.2, 0.4);
        ComplexNumbers cNbr2 = new ComplexNumbers(7.8, 8.9);

        System.out.println("The first number is: " + cNbr1.toString());
        System.out.println("The second number is: " + cNbr2.toString());

        // Operations
        System.out.println();
        System.out.println("Sum is: " + cNbr1.add(cNbr2).toString());
        System.out.println("Difference is: " + cNbr1.subtract(cNbr2).toString());
    }
}