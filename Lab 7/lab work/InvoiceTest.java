//Driver class InvoiceTest
public class InvoiceTest {
	public static void main(String[] args) {
		//Constructing two objects with the name of Invoice 1 and Invoice 2
		Invoice invoice1 = new Invoice("1234", "Hammer", 2, 14.95);
		Invoice invoice2 = new Invoice("5678", "Paint Brush", -5, -9.99);
		
		//Print out the part number, description, quantity, price, and invoice amount
		System.out.printf("Invoice 1: %s, %s, %d, %.2f, %.2f\n", invoice1.getPart_Number(), invoice1.getPart_Description(), invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());
		System.out.printf("Invoice 2: %s, %s, %d, %.2f, %.2f\n", invoice2.getPart_Number(), invoice2.getPart_Description(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());
	
		//Update the first invoice
		invoice1.setPart_Number("001234");
		invoice1.setPartDescription("Yellow Hammer");
		invoice1.setQuantity(3);
		invoice1.setPrice(19.49);
		
		//Update the second invoice
		invoice2.setQuantity(3);
		invoice2.setPrice(9.49);
		
		//Print out the part number, description, quantity, price, and invoice amount
		System.out.printf("\nInvoice 1: %s, %s, %d, %.2f, %.2f\n", invoice1.getPart_Number(), invoice1.getPart_Description(), invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());
		System.out.printf("Invoice 2: %s, %s, %d, %.2f, %.2f\n", invoice2.getPart_Number(), invoice2.getPart_Description(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());
	}

}
