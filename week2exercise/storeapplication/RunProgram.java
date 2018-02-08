package week2exercise.storeapplication;

public class RunProgram {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("GPU123", "Nvidia 1080Ti", 6, 1200.00);
		
		System.out.println("Invoice of Part:");
		System.out.println("Number\t\tDescription\t\tQuantity\tPrice\t\tTotal");
		System.out.println("====================================================================================");
		System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n", invoice1.getPartNumber(), invoice1.getPartDescription(), 
					invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());
	}
	
}
