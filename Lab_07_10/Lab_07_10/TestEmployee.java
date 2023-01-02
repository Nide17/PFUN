import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		String name;
		int age;
		int hours;
		WeekDays busyDay = WeekDays.MONDAY;
		String weekDayString;
		
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   
	    System.out.println("Hi there!");
	    System.out.println();
	    
	    System.out.println("Plase enter your name: ");
	    name = reader.readLine();
	    
	    System.out.println("Plase enter your age: ");
	    age = Integer.parseInt(reader.readLine());
	    
	    System.out.println("Plase enter hours you worked for this week: ");
	    hours = Integer.parseInt(reader.readLine());
	    
	    System.out.println("What was your busy day: ");
	    weekDayString = reader.readLine();
	    
	    busyDay = WeekDays.getWeekDayInString(weekDayString);
		Employee employee_1 = new Employee(name, age, hours, busyDay);
		
	    
		  System.out.printf("\n\n\t\t\t--------------------- EMPLOYEE INFORMATION -------------------");
		  System.out.printf("\n\n\t\t\t\t- Name: " + employee_1.getName());
		  System.out.printf("\n\n\t\t\t\t- Age: " + employee_1.getAge());
		  System.out.printf("\n\n\t\t\t\t- Worked Hours: " + employee_1.getHours());
		  System.out.printf("\n\n\t\t\t\t- Busy Day: " + employee_1.getBusyDay());
		  System.out.printf("\n\n\t\t\t\t- Salary: " + employee_1.calculateSalary());
		  System.out.printf("\n\n\t\t\t\t- Casted Salary: " + (int)employee_1.calculateSalary());
		  System.out.printf("\n\n\t\t\t--------------------------------------------------------------");	
	}

}
