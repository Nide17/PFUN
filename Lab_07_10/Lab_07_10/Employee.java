public class Employee {
	
	private String name;
	private int age;
	private int hours;
	private double moneyPerHour = 15.22;
	private WeekDays busyDay;
	
	public Employee(String name, int age, int hours, WeekDays busyDay) {
		this.name =  name;
		this.age = age;
		this.hours = hours;
		this.busyDay = busyDay;
	}
	
	public Employee() {
		this.name =  "Yves";
		this.age = 25;
		this.hours = 5;
		this.busyDay = WeekDays.MONDAY;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getMoneyPerHour() {
		return moneyPerHour;
	}
	public void setMoneyPerHour(double moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	public double calculateSalary() {
		return (moneyPerHour * hours);
	}

	public WeekDays getBusyDay() {
		return busyDay;
	}
	public void setBusyDay(WeekDays busyDay) {
		this.busyDay = busyDay;
	}
	
	
}
