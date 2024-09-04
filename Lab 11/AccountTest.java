package Lab11_inheritance;

import java.util.ArrayList;

public class AccountTest {
	public static void main(String [] args) {
		
		//Create objects
		Account acc1 = new Account("A001", "Pensonic", 0);
		SupplierAccount Sacc1 = new SupplierAccount("S001", "Jones",0,"VIP");
		SupplierAccount Sacc2 = new SupplierAccount("S002", "Albert",0,"Normal");
		CustomerAccount Cacc1= new CustomerAccount("C001", "Daniel",1000);
		
		//Store all account details into an ArrayList
		ArrayList<Account> accountList= new ArrayList<Account>(); //Use the parent class Account to insert all the values of different accounts
		
		
		accountList.add(acc1);
		accountList.add(Sacc1);
		accountList.add(Sacc2);
		accountList.add(Cacc1);
		
		
		for (Account a: accountList) {
			if (a instanceof SupplierAccount) { //Check if it is a supplier account
				((SupplierAccount)a).sellItem(100, 5.8); //Since the account class does not have sellItem method, we need to cast it to the supplier account to access the sellItem method
			}
			
			if (a instanceof CustomerAccount) {
				((CustomerAccount)a).buyItem(7, 250.30);
				((CustomerAccount)a).ReceivePayment(200);
				
				//or
				//CustomerAccount temp = (CustomerAccount) a;
				//temp.buyItem(7, 250.30);
				//temp.ReceivePayment(200);
			}
			
			System.out.println(a);
		}
		
//		Sacc1.sellItem(100, 5.80);
//		Sacc2.sellItem(100, 5.80);
//		Cacc1.buyItem(7, 250.30);
//		Cacc1.ReceivePayment(200);
//		System.out.println(acc1.toString());
//		System.out.println(Sacc1.toString());
//		System.out.println(Sacc2.toString());
//		System.out.println(Cacc1.toString());
//		System.out.println(acc1);
//		System.out.println(Sacc1);
//		System.out.println(Sacc2);
//		System.out.println(Cacc1);
	}
	
}
