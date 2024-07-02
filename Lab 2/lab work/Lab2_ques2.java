// Lab 2 question 2
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Lab2_ques2 {

	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList <String>();
		String input_name = "0" , del_name , search_name;
		int search_result;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to enter input
		System.out.println("Enter name (-1 to end loop, -2 to delete name and -3 to to search for a name");
		input_name = keyboard.nextLine();
		
		while (!input_name.equals("-1")) {
			
			if (names.contains(input_name)) {
				System.out.println("You have entered a duplicate name!");
			}
			
			else if (input_name.equals("-2")) {
				System.out.println("Please enter the name to delete:");
				del_name = keyboard.nextLine();
				names.remove(del_name);
				System.out.println("The name has been deleted!");
			}
				
			else if (input_name.equals("-3")) {
				System.out.println("Please enter the name you wish to search:");
				search_name = keyboard.nextLine();
				search_result = Collections.binarySearch(names,search_name);
				System.out.printf("The name is at index %s%n", search_result);
				
			}
			
			else {
				names.add(input_name);
				Collections.sort(names);
				}
			
			System.out.println("Enter name (-1 to end loop, -2 to delete name and -3 to to search for a name");
			input_name = keyboard.nextLine();
			
			}
			
			//Blank space
			System.out.println();
			
			System.out.printf("The name you entered are: %s%n", names);
		
			keyboard.close();
			
			
		}
		

	}


