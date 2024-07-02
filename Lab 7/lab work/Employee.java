//Model class Employee
public class Employee {
	
	//Declare attributes
	private String name;
	private double monthly_Salary, amt_Increase, newSalary;
	public static double total_Salary = 0;
	
	//Constructor to initialize the attributes
	public Employee(String name, double monthly_Salary) {
		this.name = name;
		this.monthly_Salary = monthly_Salary;
		setSalary(monthly_Salary);
		
	}
	
	//Setter and getters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSalary(double monthly_Salary) {
		if (monthly_Salary < 0) {
			throw new IllegalArgumentException("Salary cannot be negative!");
		} 
		
		else {
			this.monthly_Salary = monthly_Salary;
			total_Salary += (monthly_Salary * 12);
		}
		
	}
	
	public double getSalary() {
		return this.monthly_Salary;
	}
	//Increase salary
	public double increaseSalary(double percent_Increase) {
		amt_Increase = (monthly_Salary * (percent_Increase / 100));
		newSalary = monthly_Salary + amt_Increase;
		total_Salary = ((total_Salary - (monthly_Salary * 12)) +  (newSalary * 12));
		return newSalary;
		
	}
	
}
