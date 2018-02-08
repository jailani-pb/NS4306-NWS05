package week1exercise.bankapplication;

public class Account {
	
	String name;
	double balance;
	
	public void deposits(double amount) {
		if(amount >= 0.0) {
			balance += amount;
		}
	}
	
	public String withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return "Withdrawal is successful";
		} else {
			return "Withdrawal amount exceeded account balance";
		}
	}
	
}
