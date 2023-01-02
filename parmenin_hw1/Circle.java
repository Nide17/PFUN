//Question 2.28
import java.io.*;
public class Circle
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int radius;
        
        System.out.println("Enter the radius: ");
        radius = Integer.parseInt(kb.readLine());
        
        System.out.printf("Diameter = %d\n", 2 * radius); // Wrong - diameter should be float
        System.out.printf("Circumference = %f\n", 2 * Math.PI * radius);
        System.out.printf("Area = %f", Math.PI * Math.pow(radius, 2));
    }

}
