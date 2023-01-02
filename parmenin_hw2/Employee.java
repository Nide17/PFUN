package hw2;
// Question 3.13
public class Employee
{
    private String firstName;
    private String lastName;
    private double salary;
    
//    Constructor that initialises the three instance variables
    public Employee(String firstName, String lastName, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
//      checking that monthly salary is positive - Not a good idea
        if(salary >= 0)
        {
            this.salary = salary;
        }
    }
    
//    set and get method for each instance variable.
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
    public double getSalary()
    {

        return salary;
    }
    public void setSalary(double salary)
    {
//        checking that monthly salary is positive
        if(salary >= 0)
        {
            this.salary = salary;   
        }
    }
}
