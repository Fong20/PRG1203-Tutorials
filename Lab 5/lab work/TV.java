//model class TV
public class TV {
	
	//declaration of attributes
	String stock_number, make;
	char screen_type;
	double price, tax_rate, tax;
	
	
	//Declare constructor
	public TV (String sn, String m, char st, double p) {
		stock_number = sn;
		make = m;
		screen_type = st;
		price = p;
		
	}
	
	//Setters & Getters
		//Setter to set the stock number
		public void setStock_number(String sn) {
			stock_number = sn;
		}
		
		//Getter to return the stock number
		public String getStock_number() {
			return stock_number;
		}

		//Setter to set the make of the TV
		public void setMake(String m) {
			make = m;
		}
		
		//Getter to return the make of the TV
		public String getMake() {
			return make;
		}
		
		//Setter to set the TV's screen type
		public void setScreen_type(char st) {
			screen_type = st;
		}
		
		//Getter to return the TV"s screen type
		public char getScreen_type() {
			return screen_type;
		}
		
		//Setter to set the price of the TV
		public void setPrice(double p) {
			price = p;
		}
		
		//Getter to return the price of the TV
		public double getPrice() {
			return price;
		}
	
	
	//toString method
	public String toString() {
		return String.format("\nThe TV has a stock number of %s, make of %s, screen type of %c and price of %.2f", stock_number, make, screen_type, price);
		
	}
	
	//Additional methods
		//Setter to allow the user to set the tax rate
		public void setTax(double tax_rate) {
			tax = price * (tax_rate / 100);
		}
		
		//Getter to return the amount of tax to be paid
		public double getTax() {
			return tax;
		}
	
}
