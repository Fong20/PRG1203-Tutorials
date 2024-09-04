package Lab10_aggregation;

public class Author {
	//Declare attributes
	private String name, email;
	private char gender;
	
	//Declare constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return String.format("Author [name = %s, email = %s, gender = %c]", getName(), getEmail(), getGender());
	}

	
	
	
}
