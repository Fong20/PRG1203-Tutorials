package Lab10_aggregation;

public class Book {
	//Declare attributes
	private String name;
	private Author author; //Establish relationship with the Author class
	private double price;
	private int qty = 0;
	
	//Declare constructor
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}
	
	public String toString() {
		return String.format("Book[name = %s, name = %s, price = %.2f, qty = %d]", getName(), getAuthor(), getPrice(), getQty());
	}
	

}
