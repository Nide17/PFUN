
// Question 2.35 - Please handle negative values and division by zero
import java.io.*;

public class CarPoolCalc {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        float totalMiles;
        float costPerGallon;
        float avgMilesPerGallon;
        float parkingFeesPerDay;
        float tollsPerDay;
        float totalGallonsUsed;
        float tripCost;
        float dailyCost;

        System.out.println("Enter total miles used today: ");
        totalMiles = Float.parseFloat(kb.readLine());

        System.out.println("Enter cost per gallon: ");
        costPerGallon = Float.parseFloat(kb.readLine());

        System.out.println("Enter average miles per gallon: ");
        avgMilesPerGallon = Float.parseFloat(kb.readLine());

        System.out.println("Enter today's parking fees: ");
        parkingFeesPerDay = Float.parseFloat(kb.readLine());

        System.out.println("Enter today's tolls: ");
        tollsPerDay = Float.parseFloat(kb.readLine());

        // Finding the total gallons of gasoline used and trip cost
        totalGallonsUsed = totalMiles / avgMilesPerGallon;
        tripCost = totalGallonsUsed * costPerGallon;

        // Calculating the total cost and displaying
        dailyCost = tripCost + parkingFeesPerDay + tollsPerDay;
        System.out.println("Your total driving cost today is: " + dailyCost);
    }
}