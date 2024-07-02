//Driver class AccountTest
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args) {
		
		//Construct two objects name account 1 and account 2
		Account account1 = new Account(50.00);
		Account account2 = new Account(8.93);
		
		//Print out the balance of account 1 and account 2
		System.out.printf("account 1 balance: %.2f\n" , account1.getBalance());
		System.out.printf("account 2 balance: %.2f\n" , account2.getBalance());
		
		Scanner keyboard = new Scanner(System.in);
		
		double credit_amt1, credit_amt2, debit_amt1, debit_amt2;
		
		//Prompt the user for the amount to be credited for account 1 and account 2
			//Credit the amount to the account 1's balance
			System.out.print("\nEnter amount to be deposited for account1:");
			credit_amt1 = keyboard.nextDouble();
			account1.Credit(credit_amt1);
			
			//Credit the amount to the account 2's balance
			System.out.print("Enter amount to be deposited for account2:");
			credit_amt2 = keyboard.nextDouble();
			account2.Credit(credit_amt2);
			
		//Print out the balance of account 1 and account 2
		System.out.printf("\naccount 1 balance: %.2f " , account1.getBalance());
		System.out.printf("\naccount 2 balance: %.2f\n" , account2.getBalance());
		
		
		//Prompt the user for the amount to be debited for account 1 and account 2
			//Debit the amount to the account 1's balance
			System.out.print("\nEnter amount to be withdrawn for account1:");
			debit_amt1 = keyboard.nextDouble();
			account1.Debit(debit_amt1);
			
			//Debit the amount to the account 2's balance
			System.out.print("Enter amount to be withdrawn for account2:");
			debit_amt2 = keyboard.nextDouble();
			account2.Debit(debit_amt2);
			
	//Print out the balance of account 1 and account 2
	System.out.printf("\naccount 1 balance: %.2f" , account1.getBalance());
	System.out.printf("\naccount 2 balance: %.2f\n " , account2.getBalance());
	
	//Print out the total money available in the bank
	System.out.printf("\nTotal balance of all accounts is: %.2f " , Account.getTotal());
	}

}
