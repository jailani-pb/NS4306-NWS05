package week1exercise.storeapplication;

public class RunProgram {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice();
		invoice1.partNumber = "GPU123";
		invoice1.partDescription = "Nvidia 1080Ti";
		invoice1.quantity = 6;
		invoice1.price = 1200.00;
		
		System.out.println("Invoice of Part:");
		System.out.println("Number\t\tDescription\t\tQuantity\tPrice");
		System.out.println("===============================================================");
		System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\n", invoice1.partNumber, invoice1.partDescription, invoice1.quantity, invoice1.price);
	}
	
}
