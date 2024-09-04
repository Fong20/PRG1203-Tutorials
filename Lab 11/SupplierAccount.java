package Lab11_inheritance;

public class SupplierAccount extends Account {
	//Declare attributes
	String SupplierType;
	
	//Declare constructor
	public SupplierAccount(String num, String nm,double bal, String st) {
		super(num, nm, bal);
		SupplierType = st;
	}

	public String getSupplierType() {
		return SupplierType;
	}

	public void setSupplierType(String st) {
		SupplierType = st;
	}
	
	//Override
	public void increaseBalance(double amt) {
		if (getSupplierType().equals("VIP")) {
			super.increaseBalance(amt * 2);
		}
		
		else {
			super.increaseBalance(amt);
		}
	}
	
	public void sellItem(int qty, double price) {
		double profit = (price * qty);
		
		super.increaseBalance(profit);
	}
	
	@Override
	public String toString() {
		return String.format("Supplier: type %s %s", SupplierType, super.toString());
	}
	

}
