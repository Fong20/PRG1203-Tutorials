package Lab11_inheritance;

public class Account {
	//Declare attributes
	private String number, name;
	private double balance;
	
	
	
	//Declare constructor
	public Account(String num, String nm, double bal) {
		number = num;
		name = nm;
		balance = bal;
	}


	
	//Setters and getters
	public String getNumber() {
		return number;
	}



	public void setNumber(String num) {
		number = num;
	}



	public String getName() {
		return name;
	}



	public void setName(String nm) {
		name = nm;
	}



	public double getBalance() {
		return balance;
	}

	public void increaseBalance(double amt) {
		if (amt > 0) {
			balance += amt;
		}
	}
	
	public void decreaseBalance(double amt) {
		if (amt > 0) {
			balance -= amt;
		}
	}

	@Override
	public String toString() {
		return String.format("account number %s, name %s, current balance is: %.2f", number, name, balance);
	}

	
	
	
}
