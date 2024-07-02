//Lab 3 question 4
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab3_ques4 {
	public static void main(String[] args) {
		
		try {
			Scanner keyboard = new Scanner(new File("marks.txt"));
			
			while(keyboard.hasNext()) {
				System.out.printf("%s %.2f\n", keyboard.next(), keyboard.nextInt());
			}
			
			if (keyboard != null) {
				keyboard.close();
			}
		}
		
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		catch (Exception e) {
			System.out.println("An error" + e + "has been found!");
		}
		
		

	}

}
