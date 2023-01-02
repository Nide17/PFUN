package hw2;
// Question 3.17 - test app

import java.io.*;
import java.util.Calendar;

public class HealthProfileTest
{
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your first name: ");
        String fName = kb.readLine();
        
        System.out.println("What is your last name: ");
        String lName = kb.readLine();
        
        System.out.println("What is your gender: ");
        String gender = kb.readLine();
        
        System.out.println("What is your height in inches: ");
        float heightInInches = Float.parseFloat(kb.readLine());
        
        System.out.println("What is your weight in pounds: ");
        float weightInPounds= Float.parseFloat(kb.readLine());
        
        System.out.println("What is your year of birth: ");
        int yob = Integer.parseInt(kb.readLine());
        
        System.out.println("What is your month of birth: ");
        int mob = Integer.parseInt(kb.readLine());
        
        System.out.println("What is your day of birth: ");
        int dob = Integer.parseInt(kb.readLine());
        
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(yob, mob-1, dob);
        
      HealthProfile hp = new HealthProfile(fName, lName, gender, heightInInches, weightInPounds, dateOfBirth);
      
      System.out.println("You are " + hp.calculateAge() + " years old");
      
      System.out.println();
      System.out.printf("Your BMI is: %.2f%n", hp.calculateBMI());
     
      System.out.println("BMI VALUES");
      System.out.println("Underweight: less than 18.5");
      System.out.println("Normal:      between 18.5 and 24.9");
      System.out.println("Overweight:  between 25 and 29.9");
      System.out.println("Obese:       30 or greater");
      System.out.println();
      
      System.out.println("Your maximum heart rate is: " + hp.calculateMaxHeartRate());     
      System.out.println("Your target heart rate range is: " + hp.calculateTargetHeartRate());

    }

}
