package Lab13;

import java.util.Arrays;

public class Subject {
	//Create attributes
	private String subjectCode;
	private Student[] studentList;
	private Staff lecturer;
	
	//Create constructor
	public Subject(String subjectCode, Student[] studentList, Staff lecturer) { //Aggregation 
		this.subjectCode = subjectCode;
		this.studentList = studentList;
		this.lecturer = lecturer;
	}
	
	//Setters and getters
	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Student[] getStudents() {
		return studentList;
	}

	public void setStudents(Student[] studentList) {
		this.studentList = studentList;
	}

	public Staff getLecturer() {
		return lecturer;
	}

	public void setLecturer(Staff lecturer) {
		this.lecturer = lecturer;
	}
	
	@Override
	public String toString() {
		return String.format("Subject [Subject code= %s , students= %s, lecturer= %s]", subjectCode, Arrays.toString(getStudents()), lecturer);
	}
}
