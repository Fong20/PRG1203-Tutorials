//Driver class to test the student model class

public class studenttest {
	public static void main(String[] args) {
		
		//Construct object to access the Student methods
		Student student1 = new Student("Alex","BCS",5);
		Student student2 = new Student("Mindy","BIT",2);
		
		//Update the student's name to Johnson	
		student1.setName("Johnson");
		
		//Check if both student's are eligible to get credit exemption
		//Print using conditional statement
		System.out.println(student1.checkEligibility()? student1 + " is eligible to get credit exemption" : student1 + "is not eligible to get credit exemption" );
		System.out.println(student2.checkEligibility()? student2 + " is eligible to get credit exemption" : student2 + "is not eligible to get credit exemption" );
		
		
	}
	

}
