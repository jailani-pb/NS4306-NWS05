package week1exercise.storeapplication;

public class Invoice {

	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public double getInvoiceAmount() {
		if(quantity < 0) { 
			quantity = 0;
		}
		if(price < 0) {
			price = 0.0;
		}
		return quantity * price;
	}
	
	
	
}
