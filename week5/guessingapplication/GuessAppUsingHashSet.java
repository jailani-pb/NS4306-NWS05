package week5.guessingapplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GuessAppUsingHashSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> guessedNumbers = new HashSet<Integer>();
		
		int randomNumber = (int) (Math.random() * 100);
		while(true) {
			System.out.println("Enter your guess (1-100)");
			String guessInput = scanner.nextLine();
			int guess = Integer.parseInt(guessInput);
			if(guess == randomNumber) {
				System.out.println("Lurus");
				break;
			} else {
				if(!guessedNumbers.add(guess)) {
					System.out.println("Sudah Teka: " + guess);
				}
				System.out.println("Salah");
			}
		}
		scanner.close();
	}
	
}
