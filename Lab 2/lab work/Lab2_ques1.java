import java.util.Scanner;

//Lab 2 question 1
public class Lab2_ques1 {

	public static void main(String[] args) {
		int num , count = 0, array_Size;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user to enter the size of the array
		System.out.println("Please enter how many numbers you wish to add?:");
		array_Size = keyboard.nextInt();
		
		//Set the array size using the user's input
		int [] array = new int[array_Size];
		
		//Loop based on the size of the array
		while (count < array.length) {
			//Prompt user to enter elements in the array
			System.out.print("\nEnter a number:");
			num = keyboard.nextInt();
			
			//Checking condition if the number inputed is between 10 and 100
			//If the number is between 10 and 100, run the following codes
			if (num >= 10 && num <= 100) {
				
				//Duplication checking
				boolean dup_num = false;
				for (int index = 0; index < array.length; index++) {
					if(num == array[index]) {
						dup_num = true;
						break;
					}
				}
					
				//if the number inputed is not a duplicate number, insert the number into the array
				if (!dup_num) {
					array[count] = num;
					count++;
				}
				
				//If the number inputed is a duplicate number, inform the user about it.
				else {
					System.out.printf("%d has already been entered", num);
				}	
				
			}
			
			//If the number is not between 10 and 100, inform the user that he/she must enter number between 10 and 100
			else {
				System.out.println("The number must be between 10 and 100!");
			}
			
			//Print out the values in the array
			for (int index = 0; index < count; index++) {
				System.out.print(array[index] + " ");
				
			}		
		
		}
		
			keyboard.close();
	}
}
		
		
	

				
			
		
		
		
		
		
		

