//Lab 1b Exercise 1

import java.util.Scanner;

public class Lab1b_ques1 {
	public static void main(String [] args) { // this is the main method
		int product_num, quantity_sold;
		double price, total_price1 = 0, total_price2 = 0, total_price3 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user to input the product number
		System.out.print("Enter product number (1-3) (0 to stop): ");
		product_num = keyboard.nextInt();
		
		//While loop is used to loop through the process of calculating the total price of each product based on the user's input
		//Selection statement using switch statement to determine
		
		while (product_num != 0) {
			switch (product_num) 	{
				
				//If user types in 1, it will calculate the total price for product 1
				case 1:
					System.out.print("Enter quantiy sold: ");
					quantity_sold = keyboard.nextInt();
					price = 2.98 * quantity_sold;
					total_price1 += price;
					break;
				
				//If user types in 2, it will calculate the total price for product 2
				case 2:
					System.out.print("Enter quantiy sold: ");
					quantity_sold = keyboard.nextInt();
					price = 4.50 * quantity_sold;
					total_price2 += price;
					break;
				
				//If user types in 3, it will calculate the total price for product 3	
				case 3:
					System.out.print("Enter quantiy sold: ");
					quantity_sold = keyboard.nextInt();
					price = 9.98 * quantity_sold;
					total_price3 += price;
					break;
				
				//If the user types in anything besides 1,2 and 3, it will prompt the user to enter the correct information.
				default:
					System.out.print("Invalid instruction! Please enter a valid instruction.");
					break;
			
		}
					
			//Prompt the user to re-enter the product number
			System.out.print("Enter product number (1-3) (0 to stop): ");
			product_num = keyboard.nextInt();
			
	}
			// Print Blank space
			System.out.println();

			//Is user entered 0, it will exit the while loop and display total price of all products
			System.out.printf("Product 1: $%.2f%n", total_price1);
			System.out.printf("Product 2: $%.2f%n", total_price2);
			System.out.printf("Product 3: $%.2f%n", total_price3);
			
			keyboard.close();
	}

}
