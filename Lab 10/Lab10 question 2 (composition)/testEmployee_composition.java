package Lab10_composition;

public class testEmployee {
	public static void main(String[] args) {
		
		//Composition
		
		//Destroying the employee object will affect the date object since the date object is created when creating the employee object
		Employee employee1 = new Employee("George", "Tan", 17,8, 1990,25,6,2014 );
		
		//Print the output
		System.out.println(employee1);
		
		//Update the employee's last name
		employee1.setLastName("Chan");
		
		
		//Print the output
		System.out.println(employee1);
		
		//Update the employee's hired year
		//Since we use composition, we did not create the object here so we cannot directly use the object to set the year.
		//We need to use the getter then followed by the setter
		//employee1.getHireDate() is the object
		employee1.getHireDate().setYear(2015);
		
		//Print the output
		System.out.println(employee1);
		
	}

}
