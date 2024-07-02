//Driver class DateTest
import java.util.Scanner;
public class DateTest {
	public static void main(String[] args) {
		
		int user_choice = getMenuChoice();
		int day, month, year;
		String monthName;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (user_choice != 4) {
			try {
				switch (user_choice) {
					case 1: // DD//MM/YYYY
						System.out.println("\nEnter Day of Month:");
						day = keyboard.nextInt();
						
						System.out.println("Enter Month (1-12):");
						month = keyboard.nextInt();
						
						System.out.println("Enter Year:");
						year = keyboard.nextInt();
						
						Date date = new Date(day, month, year);
						
						System.out.printf("%s\n", date.toString());
						break;
						
					case 2: //MonthName DD, YYYY
						System.out.println("\nEnter Month Name:");
						monthName = keyboard.next();
						
						System.out.println("Enter Day of Month:");
						day = keyboard.nextInt();
						
						System.out.println("Enter Year:");
						year = keyboard.nextInt();
						
						date = new Date(monthName, day, year);
						
						System.out.printf("%s\n", date.toMonthNameDateString());
						break;
						
						
					case 3: // DDD YYYY
						System.out.println("\nEnter Day of Year:");
						day = keyboard.nextInt();
						
						System.out.println("Enter Year:");
						year = keyboard.nextInt();
						
						date = new Date(day, year);
						
						System.out.printf("%s\n", date.toDayDateString());
				}
				
				//Prompt the user again
				user_choice = getMenuChoice();
				
			}
			
			catch (IllegalArgumentException e) {
				System.out.printf("%s\n", e.getMessage());
			}
		}
	}
	
			//getMenuChoice method is used to obtain the user's choice
			private static int getMenuChoice() {
				Scanner keyboard = new Scanner(System.in);
				System.out.println("\nEnter 1 for format (DD/MM/YYYY)");
				System.out.println("Enter 2 for format (MonthName DD, YYYY");
				System.out.println("Enter 3 for format (DDD YYYY)");
				System.out.println("Enter 4 to exit");
				System.out.print("Pick your choice:");
				
				int choice = keyboard.nextInt();
				return choice;
			}

}

