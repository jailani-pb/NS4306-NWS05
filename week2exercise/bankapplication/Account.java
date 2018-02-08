package week2exercise.bankapplication;

public class Account {
	
	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		if(balance < 0) {
			this.balance = 0.0;
		} else {
			this.balance = balance;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
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
