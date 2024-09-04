package Lab13;

import java.util.ArrayList;

public class TestProg {
	public static void main(String[] args) {
		
		//Create objects
		Staff staff1 = new Staff("Mindy", "Bandar Sunway", "Sunway University", 2000);
		
		//Update the school to sunway college
		staff1.setSchool("Sunway College");
		
		//Print out the output
		System.out.println(staff1);
		
		//Create a subject code PRG1203 with 3 students and 1 lecturer
		
		//Create student objects
		Student[] students = new Student[3];
		
		students[0] = new Student("Amnad", "Johor", "BIT", 2017, 1500);
		students[1] = new Student("John", "Pahang", "BCS", 2016, 1400);
		students[2] = new Student("Sally", "Selangor", "BSE", 2015, 1350);
		
		//Create lecturer object
		Staff lecturer = new Staff("Jinny","Bandar Sunway", "Sunway University", 2000);
		
		Subject sub1 = new Subject("PRG1203", students, lecturer);
		
		//Print out the output
		System.out.println(sub1);
		
		//Create an arraylist to hold all the students and lecturer
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(students[0]);
		personList.add(students[1]);
		personList.add(students[2]);
		personList.add(lecturer);
		
		//Print out the objects by looping through the ArrayList
		for (Person p : personList) {
			System.out.println(p);
			
		}
	}

}
