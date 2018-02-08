package week2exercise.bankapplication;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		System.out.println("Account1: " + account1.getName() + " $" + account1.getBalance());
		System.out.println("Account2: " + account2.getName() + " $" + account2.getBalance());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter deposit amount for account1:");
		String amountInput = scanner.nextLine();
		double amount = Double.parseDouble(amountInput);
		System.out.println("Adding " + amount + " to account1 balance.");
		account1.deposits(amount);
		
		System.out.println("Account1: " + account1.getName() + " $" + account1.getBalance());
		System.out.println("Account2: " + account2.getName() + " $" + account2.getBalance());
		
		System.out.println("Enter deposit amount for account2:");
		amountInput = scanner.nextLine();
		amount = Double.parseDouble(amountInput);
		System.out.println("Adding " + amount + " to account2 balance.");
		account2.deposits(amount);
		
		System.out.println("Account1: " + account1.getName() + " $" + account1.getBalance());
		System.out.println("Account2: " + account2.getName() + " $" + account2.getBalance());
		
		System.out.println("Enter withdraw amount from account1:");
		amountInput = scanner.nextLine();
		amount = Double.parseDouble(amountInput);
		System.out.println("Withdrawing " + amount + " from account1 balance.");
		System.out.println(account1.withdraw(amount));
		
		System.out.println("Account1: " + account1.getName() + " $" + account1.getBalance());
		System.out.println("Account2: " + account2.getName() + " $" + account2.getBalance());
		
		System.out.println("Enter withdraw amount from account2:");
		amountInput = scanner.nextLine();
		amount = Double.parseDouble(amountInput);
		System.out.println("Withdrawing " + amount + " from account2 balance.");
		System.out.println(account2.withdraw(amount));
		
		System.out.println("Account1: " + account1.getName() + " $" + account1.getBalance());
		System.out.println("Account2: " + account2.getName() + " $" + account2.getBalance());
		
		scanner.close();
	}
	
}
