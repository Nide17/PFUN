// Question 11

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    // Initialization
    public ComplexNumbers() {
        realPart = 0.0;
        imaginaryPart = 0.0;
    }

    public ComplexNumbers(double real, double i) {
        realPart = real;
        imaginaryPart = i;
    }

    // Performing operations
    public ComplexNumbers add(ComplexNumbers right) {
        return new ComplexNumbers(realPart + right.realPart, imaginaryPart + right.imaginaryPart);
    }

    public ComplexNumbers subtract(ComplexNumbers right) {
        return new ComplexNumbers(realPart - right.realPart, imaginaryPart - right.imaginaryPart);
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", realPart, imaginaryPart);
    }
}
