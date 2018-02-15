package week6.loginapplication;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LoginApp loginApp = new LoginApp();
		loginApp.register("abc", "abc");
		loginApp.register("def", "def");
		
		while(true) {
			System.out.println("Login App Test");
			System.out.println("(1) Register");
			System.out.println("(2) Login");
			System.out.println("(3) Change Password");
			String optionInput = scanner.nextLine();
			int option = Integer.parseInt(optionInput);
			
			if(option == 1) {
				System.out.println("Username:");
				String username = scanner.nextLine();
				System.out.println("Password:");
				String password = scanner.nextLine();
				if(loginApp.register(username, password)) {
					System.out.println("Registration Successful");
				} else {
					System.out.println("Registration Failed");
					System.out.println("Username Exists");
				}
			} else {
				if(option == 2) {
					System.out.println("Username:");
					String username = scanner.nextLine();
					System.out.println("Password:");
					String password = scanner.nextLine();
					if(loginApp.login(username, password)) {
						System.out.println("Login Successful");
					} else {
						System.out.println("Wrong username/password");
					}
				} else {
					if(option == 3) {
						System.out.println("Input Username:");
						String username = scanner.nextLine();
						System.out.println("Input Password:");
						String password = scanner.nextLine();
						System.out.println("Input New Password");
						String newPassword = scanner.nextLine();
						if(loginApp.changePassword(username, password, newPassword)) {
							System.out.println("Change Password Successful.");
						} else {
							System.out.println("Change Password Failed.");
						}
					} else {
						break;
					}
				}
			}
		}
		
		scanner.close();
	}
	
}
