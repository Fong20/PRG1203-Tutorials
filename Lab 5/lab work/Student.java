//Model class Student

public class Student {
	
	//Declare attributes
	String name, course, eligibility;
	int semester;
	
	//Declare constructor to initialize the attributes
	public Student (String n, String c, int s) {
		name = n;
		course = c;
		semester = s;
	}
	
	//Setter & getters
		//Setter to set the student's name
		public void setName(String n) 	{
			name = n;
		}
		
		//Getter to get the student's name
		public String getName() {
			return name;
		}
		
		//Setter to set the student's course
		public void setCourse(String c) 	{
			course = c;
		}
		
		//Getter to get the student's course
		public String getCourse() {
			return course;
		}
		
		//Setter to set the student's semester
		public void setSemester(int s) {
			semester = s;
		}
		
		//Getter to get the student's semester
		public int getSemester() {
			return semester;
		}
		
		//toString method
		public String toString() {
			return String.format("\nStudent with name %s studies course %s in semester %d", name, course, semester);
		}
		
	//Additional methods
		//Method to identify if the student is eligible for credit exemption
		public boolean checkEligibility() {
			
			//If the student is in semester 4 to 6, it will return true
			if (semester >= 4 && semester <= 6) {
				return true;
				
			}
			
			//If the student is not in semester 4 to 6, it will return false
			else {
				return false;
			}
		}
	
}
