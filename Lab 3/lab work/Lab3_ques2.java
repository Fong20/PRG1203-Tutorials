//Lab 3 question 2
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab3_ques2 {
	public static void main(String[] args) {
		int num;
		int result;
		int [] Array = new int [5];
		
		Scanner keyboard = new Scanner(System.in);
		
		//Try block to handle code which might cause errors
		try { 
			
			//Loop through the number of elements in the array and assign user's input into the array
			for (int i = 0; i < Array.length; i++) {
					System.out.print("\nPlease enter a number:");
					num = keyboard.nextInt();
					Array[i] = num;
				}
			
			//Case to test arithmetic exception (dividing one number with zero)
				result = Array[0] / Array[1];
				
			//Case to test array index out of bounds (Set the value of element 6 in the array)
				Array[5] = 10;
			
			}	
			
			//Catch block to handle input mismatch exception
			catch (InputMismatchException e) {
				System.out.print("\nInvalid input!, please enter an integer!");
				
			}
			
			//Catch block to handle arithmetic exception
			catch (ArithmeticException e) {
				System.out.print("\nCannot be divided by 0!");
				
			}
			
			//Catch block to handle array index out of bounds exception
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("\nElement of the index is out of bounds of the array size!");
				
			}
		
			//Catch block to handle other exceptions
			catch (Exception e) {
				System.out.print("\nAn error" + e + "has occured!");
			}
			

		keyboard.close();

	}

}
