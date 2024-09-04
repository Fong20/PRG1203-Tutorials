package Lab10_aggregation;

import java.util.Arrays;

public class Books {
	//Declare attributes
	private String name;
	private Author [] authors; //Establish relationship with the Author class
	private double price;
	private int qty = 0;
	
	//Declare constructor
	public Books(String name, Author [] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public Books(String name, Author [] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
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

	public Author[] getAuthors() {
		return authors;
	}
	
	public String toString() {
		return String.format("Book [name = %s,authors = {Authors = {%s}, price = %.2f, qty = %d]", getName(), Arrays.toString(getAuthors()), getPrice(), getQty());
	}
	

}
