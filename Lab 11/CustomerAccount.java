package Lab11_inheritance;

public class CustomerAccount extends Account {
	
		//Declare constructor
		public CustomerAccount(String num, String nm, double bal) {
			super(num, nm, bal);
		}
		
		public boolean checkBalance(double total) {
			if (getBalance() > total) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		public void buyItem(int qty, double price) {
		
			if (checkBalance(qty * price)) {
				decreaseBalance(qty * price);
				
			}
			
			else {
				System.out.println("Not enough money to buy this item!\n");
			}
		}
		
		public void ReceivePayment(double amt) {
			increaseBalance(amt);
		}

		@Override
		public String toString() {
			return String.format("Customer: %s" , super.toString() );
		}
		
		

}
