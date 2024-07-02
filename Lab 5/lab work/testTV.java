//driver class testTV
import java.util.Scanner;
public class testTV {
	public static void main(String[] args) {
		
		//Construct object
		TV tv1 = new TV("S101","Elba",'R',1400);
		
		Scanner keyboard = new Scanner(System.in);
		
		//Read the price of the tv from the user and changing the price
		double user_price;
		System.out.print("Please enter the price of the tv:");
		user_price = keyboard.nextDouble();
		tv1.setPrice(user_price);
		
		//Print out the price from user
		System.out.printf("The price of the tv based on the user's input is %.2f", tv1.getPrice());
		
		//Set the rate of tax
		tv1.setTax(1.5);

		//Print out the amount of tax to be paid
		System.out.printf("\nThe amount of tax to be paid is %.2f", tv1.getTax());

	}

}
