//Model class Account
public class Account {
	//Declare attributes
		private double balance, InitialBalance;
		private static double Total = 0;
		
		//Constructor to initialize the attributes
		public Account(double ib) {
			InitialBalance = ib;
			balance = InitialBalance;
			increaseTotal(balance);
		}
		
		//Methods
		public void Credit(double CreditAmount) {
			balance += CreditAmount;
			increaseTotal(CreditAmount);
			
		}
		
		public void Debit(double DebitAmount) {
			if (DebitAmount > balance) {
				System.out.println("Debit amount exceeded account balance\n");
			}
			
			else {
				balance -= DebitAmount;
				decreaseTotal(DebitAmount);
			}
			
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void increaseTotal(double amount) {
			Total += amount;
		}
		
		public void decreaseTotal(double amount) {
			Total -= amount;
		}
		
		public static double getTotal() {
			return Total;
		}
}
