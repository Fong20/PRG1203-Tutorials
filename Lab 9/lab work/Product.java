/**
 * Product class
 * @author weitz
 *
 */
public class Product {
	
	//declare attributes
	/** title is the title for a particular product*/
	private String title;
	/** price is the price for a particular product*/
	private double price;
	/** qty is the quantity for a particular product*/
	private int qty;
	
	//Auto-generate constructor using refractor
	/**This is the complete constructor of Product class
	 * 
	 * @param title this is the product title
	 * @param price this is the price of the product
	 * @param qty this is the quantity of the product stock
	 */
	public Product(String title, double price, int qty) {
		this.title = title;
		this.price = price;
		this.qty = qty;
	}
	
	//Auto-generate setters/getters using refractor
	/** This is the setter for product's title
	 * 
	 * @param title This method sets the product's title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**This is the getter for title
	 * 
	 * @return this method will return the product's title
	 */
	public String getTitle() {
		return title;
	}
	
	/**This is the setter for product's price
	 * 
	 * @param price This method sets the product's price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**This is the getter for product's title
	 * 
	 * @return this method will return the product's price
	 */
	public double getPrice() {
		return price;
	}
	
	/**This is the setter for product's quantity
	 * 
	 * @param qty This method sets the product's quantity
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	/**This is the getter for title
	 * 
	 * @return this method will return the product's quantity
	 */
	public int getQty() {
		return qty;
	}
	
	
	
	
	

}
