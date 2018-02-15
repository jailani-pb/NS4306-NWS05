package week6.loginapplication;

import java.util.HashMap;

public class LoginApp {

	private HashMap<String, String> loginDetails;
	
	public LoginApp() {
		loginDetails = new HashMap<String, String>();
	}
	
	public boolean register(String username, String password) {
		String lowerCaseUsername = username.toLowerCase();
		if(loginDetails.containsKey(lowerCaseUsername)) {
			return false;
		} else {
			loginDetails.put(lowerCaseUsername, password);
			return true;
		}
	}
	
	public boolean changePassword
		(String username, String oldPassword, String newPassword) {
		String lowerCaseUsername = username.toLowerCase();
		return loginDetails.replace(lowerCaseUsername
				, oldPassword, newPassword);
	}
	
	public boolean login(String username, String password) {
		String lowerCaseUsername = username.toLowerCase();
		if(loginDetails.containsKey(lowerCaseUsername)) {
			if(loginDetails.get(lowerCaseUsername).equals(password)) {
				return true;
			}
		}
		return false;
	}
	
}





