//Lab 10 (aggregation)
package Lab10_aggregation;

public class Employee {
	//Declare attributes
	private String firstName;
	private String lastName;
	private Date birthDate; //Establish a relationship with the Date class
	private Date hireDate;	//Establish a relationship with the Date class

	//Empty constructor
	public Employee() {
		firstName = "";
		lastName = "";
		birthDate = null;
		hireDate = null;
		
	}
	
	//Complete constructor
	public Employee(String fn, String ln, Date bd, Date hd) {
		firstName = fn;
		lastName = ln;
		birthDate = bd;
		hireDate = hd;
		
	}
	
	//Setters and getters
	public void setFirstName(String fn) {
		firstName = fn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public String getLastName() {
		return lastName;
	}

	public void setBirthDate(Date bd) {
		birthDate = bd;
	}

	public Date getBirthDate() {
		return birthDate; //return object
	}

	public void setHireDate(Date hd) {
		hireDate = hd;
	}
	
	public Date getHireDate() {
		return hireDate;
	}

	//toString method
	public String toString() {
		return String.format("Employee with first name %s, last name %s, has birthday on %s and was hired on %s.", firstName, lastName, birthDate, hireDate);
	}
	
	
	
}
