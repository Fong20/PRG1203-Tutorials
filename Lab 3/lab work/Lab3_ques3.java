//Lab 3 question 3
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Lab3_ques3 {
	public static void main(String[] args) {
		
		String name;
		double marks;
		Formatter output;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Try block used to handle code which might cause errors
		try {
			output = new Formatter("marks.txt");
			
			do {
				//Prompt the user to enter the student's name
				System.out.println("Please enter the name of the student:");
				name = keyboard.next();
				
				//Prompt the user to enter the student's mark
				System.out.println("Please enter the marks of the student:");
				marks = keyboard.nextDouble();
				
				if (marks != -1) {
					//Insert the user's input into a text file named marks.txt
					output.format("%s %.2f\r\n", name, marks);
				}
			}
			
			while (marks != -1);
				//Close the file if the file is open
				if (output != null) {
					output.close();
				}	
			}
		
			//Catch block used to handle FileNotFoundException
			catch (FileNotFoundException e) {
				System.out.println("File not found!");
			}
			
			//Catch block used to handle other exceptions
			catch (Exception e) {
				System.out.println("An error " + e + " has been found!");
			}
			
			keyboard.close();
				
	}
}

