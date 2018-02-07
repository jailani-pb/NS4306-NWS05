package week5.guessingapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessAppUsingArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> guessedNumbers = new ArrayList<Integer>();
		
		int randomNumber = (int) (Math.random() * 100);
		while(true) {
			System.out.println("Enter your guess (1-100)");
			String guessInput = scanner.nextLine();
			int guess = Integer.parseInt(guessInput);
			if(guess == randomNumber) {
				System.out.println("Lurus");
				break;
			} else {
				for(int i = 0; i < guessedNumbers.size(); i++) {
					if(guessedNumbers.get(i) == guess) {
						System.out.println("Sudah Teka: " + guess);
						break;
					}
				}
				guessedNumbers.add(guess);
				System.out.println("Salah");
			}
		}
		scanner.close();
	}
	
}
