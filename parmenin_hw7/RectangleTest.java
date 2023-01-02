// Question 8.5

import java.io.*;

public class RectangleTest {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the length:");
        float length = Float.parseFloat(kb.readLine());
        System.out.println("Enter the width:");
        float width = Float.parseFloat(kb.readLine());

        Rectangle rect = new Rectangle();
        rect.setLength(length);
        rect.setWidth(width);

        if (length > 0 && length < 20 && width > 0 && width < 20) {
            System.out.println("The perimeter is " + rect.calculatePerimeter());
            System.out.println("The area is " + rect.calculateArea());
        }
    }

}
