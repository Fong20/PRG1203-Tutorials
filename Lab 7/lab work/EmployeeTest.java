//Driver class EmployeeTest
public class EmployeeTest {
	public static void main(String[] args) {
		
		try {
			//Construct objects
			Employee employee1 = new Employee("Fong",5000);
			Employee employee2 = new Employee("Tan",3000);
			
			
			//Display the employee's yearly salary
			System.out.printf("Employee %s's yearly salary is %.2f\n", employee1.getName(), employee1.getSalary() * 12);
			System.out.printf("Employee %s's yearly salary is %.2f\n", employee2.getName(), employee2.getSalary() * 12);
			
			//Increase both employee's monthly salary by 10% and display it
			System.out.printf("\nEmployee %s's new yearly salary is %.2f\n", employee1.getName(), employee1.increaseSalary(10) * 12);
			System.out.printf("Employee %s's new yearly salary is %.2f\n", employee2.getName(), employee2.increaseSalary(10) * 12);
			
			//Display the total yearly salary for all employee
			System.out.printf("\nTotal yearly salary for all employee is %.2f", Employee.total_Salary);
		}
		
		//Display an error message when the monthly salary is negative value
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		
	}

}
