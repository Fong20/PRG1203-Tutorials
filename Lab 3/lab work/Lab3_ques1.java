//Lab 3 question 1
import java.util.Scanner;

public class Lab3_ques1 {
	public static void main(String [] args) {
		
		int n;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user to enter the amount of numbers to be added
		System.out.print("Please enter the amount of numbers you wish to add:");
		n  = keyboard.nextInt();
		
		System.out.printf("The result is %d", sum(n));
		
		keyboard.close();
		
	}
	
	//recursive function header named sum
	public static int sum(int n) {
		
		//base case
		if (n == 1) {
			return 1;	
		}
		
		//recursive step
		else {
			return n + sum(n-1);
		}
		
	}
	

}
