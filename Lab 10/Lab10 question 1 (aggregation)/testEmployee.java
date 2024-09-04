package Lab10_aggregation;

public class testEmployee {
	public static void main(String[] args) {
		
		//Aggregation
		//Create date object and pass in the arguments
		Date bd = new Date(17,8,1990); //birth date
		Date hd = new Date(25,6,2014); //hire date
		
		//Destroying the employee object will not affect the date object since it is an aggregation relationship
		Employee employee1 = new Employee("George", "Tan", bd, hd);
		
		//Print the output
		System.out.println(employee1);
		
		//Update the employee's last name
		employee1.setLastName("Chan");
		
		
		//Print the output
		System.out.println(employee1);
		
		//Update the employee's hired year
		hd.setYear(2015);
		
		//Print the output
		System.out.println(employee1);
		
	}

}
