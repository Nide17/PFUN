package hw2;
//Question 3.17

import java.util.Calendar;

public class HealthProfile
{
    private String firstName;
    private String lastName;
    private String gender;
    private Calendar dateOfBirth;
    private float height;
    private float weight;
    
    public HealthProfile(String firstName, String lastName,String gender, float height, float weight, Calendar dateOfBirth)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public float getHeight()
    {
        return height;
    }
    public void setHeight(float height)
    {
        this.height = height;
    }
    public float getWeight()
    {
        return weight;
    }
    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public Calendar getDateOfBirth()
    {
        return dateOfBirth;
    }
    public void setDateOfBirth(int year, int month, int day)
    {
        this.dateOfBirth.set(year, month, day);
    }
    
    public int calculateAge() 
    {
        Calendar dob = getDateOfBirth();  
        Calendar curDate = Calendar.getInstance();
        int yearOBirth = dob.get(Calendar.YEAR);
        int todayYear = curDate.get(Calendar.YEAR);
        return todayYear - yearOBirth;
    }
    
    public float calculateMaxHeartRate() 
    {
//        maximum heart rate in beats per minute  = 220 minus your age in years
        float maxHR = 220 - calculateAge();
        return maxHR;
    }
    
    public String calculateTargetHeartRate() 
    {
//        target heart rate = range that’s 50–85% of maximum heart rate
        float targetHR50 = calculateMaxHeartRate() * 0.5f;
        float targetHR85 = calculateMaxHeartRate() * .85f;
        return targetHR50 + "-" + targetHR85;
    }
    
    public float calculateBMI() 
    {
//        BMI = (weightInPounds * 703) / (heightInInches * heightInInches)
        float BMI = (this.weight * 703) / (this.height * this.height);
        return BMI;
    }
}
