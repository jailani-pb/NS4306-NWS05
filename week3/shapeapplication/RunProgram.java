package week3.shapeapplication;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];
		Scanner scanner = new Scanner(System.in);
		int shapeCounter = 0;
		
		while(true) {
			System.out.println("Area/Perimeter Calculator");
			System.out.println("Choose a shape below:");
			System.out.println("(1) Triangle");
			System.out.println("(2) Square");
			System.out.println("(3) Rectangle");
			System.out.println("(4) Circle");
			System.out.println("(5) Previous calculated shapes");
			System.out.println("(6) Quit");
			String userInput = scanner.nextLine();
			int convertUserInput = Integer.parseInt(userInput);
			
			if(convertUserInput == 1) {
				System.out.println("Triangle:");
				System.out.println("Input Base Value:");
				String baseInput = scanner.nextLine();
				int baseValue = Integer.parseInt(baseInput);
				System.out.println("Input Height Value:");
				String heightInput = scanner.nextLine();
				int heightValue = Integer.parseInt(heightInput);
				System.out.println("Input Colour:");
				String colourValue = scanner.nextLine();
				
				Triangle triangle = 
						new Triangle(colourValue, heightValue,
								baseValue);
				System.out.println("Colour: " 
								+ triangle.colour);
				System.out.println("Area: " 
								+ triangle.getArea());
				System.out.println("Perimeter: " 
								+ triangle.getPerimeter());
				shapes[shapeCounter] = triangle;
				shapeCounter++;
				if(shapeCounter > 9) {
					shapeCounter = 0;
				}
			}
			if(convertUserInput == 2) {
				System.out.println("Square");
				System.out.println("Input Side Value: ");
				String sideInput = scanner.nextLine();
				int sideValue = Integer.parseInt(sideInput);
				System.out.println("Input Colour: ");
				String colourValue = scanner.nextLine();
				
				Square square = 
						new Square(colourValue, sideValue);
				System.out.println("Colour: " + square.colour);
				System.out.println("Area: " 
								+ square.getArea());
				System.out.println("Perimeter: " 
								+ square.getPerimeter());
				shapes[shapeCounter] = square;
				shapeCounter++;
				if(shapeCounter > 9) {
					shapeCounter = 0;
				}
			}
			if(convertUserInput == 3) {
				// Complete this part as exercise.
			}
			if(convertUserInput == 4) {
				// Complete this part as exercise.
			}
			if(convertUserInput == 5) {
				for(int i = 0; i < shapes.length; i++) {
					if(shapes[i] != null) {
						System.out.println(shapes[i]);
					}
				}
			}
			if(convertUserInput == 6) {
				break;
			}
		}
		
	}
	
}





