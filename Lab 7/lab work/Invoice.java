//Model class Invoice
public class Invoice {
	
	//Declare attributes
	private String part_Number, part_Description;
	private int quantity;
	private double price, invoiceAmount;
	
	//Constructor to initialize the attributes
	public Invoice(String part_Num, String part_Desc, int quantity, double price ) {
		part_Number = part_Num;
		part_Description = part_Desc;
		this.quantity = quantity;
		this.price = price;
	}
	
	//Setter and getters
	public void setPart_Number(String part_Num) {
		part_Number = part_Num;
	}
	
	public String getPart_Number() {
		return part_Number;
	}
	
	public void setPartDescription(String part_Desc) {
		part_Description = part_Desc;
	}
	
	public String getPart_Description() {
		return part_Description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getInvoiceAmount() {
		if (quantity < 0) {
			quantity = 0;
		}
		
		if (price < 0) {
			price = 0.0;
		}
		
		invoiceAmount = quantity * price;
		return invoiceAmount;
	}
	
}
