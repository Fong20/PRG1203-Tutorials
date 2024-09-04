package Lab10_composition;

//Lab 10 (composition)

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
	//In composition, we declare the object in the owning class
	public Employee(String fn, String ln, int bd, int bm, int by, int hd, int hm, int hy) {
		firstName = fn;
		lastName = ln;
		birthDate = new Date(bd, bm, by);
		hireDate = new Date(hd, hm, hy);
		
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

	public Date getBirthDate() {
		return birthDate; //return object
	}
	
	public Date getHireDate() {
		return hireDate;
	}

	//toString method
	public String toString() {
		return String.format("Employee with first name %s, last name %s, has birthday on %s and was hired on %s.", firstName, lastName, birthDate, hireDate);
	}
	
	
	
}