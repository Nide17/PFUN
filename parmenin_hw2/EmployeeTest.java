package hw2;

// Question 3.13 - test app
public class EmployeeTest {

        public static void main(String[] args) {
                // Employee objects & Initialising the three instance
                Employee emp = new Employee("Niyomwungeri", "ISHIMWE", 100.0);
                Employee emp1 = new Employee("Patrick", "KANENE", -80.0);

                // display each object’s yearly salary
                System.out.println(emp.getFirstName() + "'s yearly income is: " + emp.getSalary() * 12);
                System.out.println(emp1.getFirstName() + "'s yearly income is: " + emp1.getSalary() * 12);

                // Giving employees a 10% raise
                double increment = emp.getSalary() * 0.1;
                double increment1 = emp1.getSalary() * 0.1;

                emp.setSalary(emp.getSalary() + increment);
                emp1.setSalary(emp1.getSalary() + increment1);

                // display each Employee’s yearly salary again
                System.out.println(emp.getFirstName() + "'s salary raised by 10% is: " + emp.getSalary() * 12);
                System.out.println(emp1.getFirstName() + "'s salary raised by 10% is: " + emp1.getSalary() * 12);
        }

}
