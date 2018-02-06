package week4.shape2d3dapp;

public class RunProgram {

	public static void main(String[] args) {
		Shape2D[] shapes = new Shape2D[5];
		shapes[0] = new Circle("Red", 10);
		shapes[1] = new Square("Blue", 20);
		shapes[2] = new Square("Yellow", 30);
		shapes[3] = new Rectangle(0, 0, 10, 10);
		shapes[4] = new Rectangle(20, 20, 10, 10);
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("### Shape " + i);
			System.out.println(shapes[i]);
			System.out.println("Area: " + shapes[i].getArea());
			System.out.println("Perimeter: " + shapes[i].getPerimeter());
			System.out.println("###########");
		}
		
		int numberOfCircle = 0;
		int numberOfSquare = 0;
		int numberOfRectangle = 0;
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				numberOfCircle++;
			}
			if(shapes[i] instanceof Square) {
				numberOfSquare++;
			}
			if(shapes[i] instanceof Rectangle) {
				numberOfRectangle++;
			}
		}
		System.out.println("Number of Circle: " 
						+ numberOfCircle);
		System.out.println("Number of Square: " 
						+ numberOfSquare);
		System.out.println("Number of Rectangle: " 
						+ numberOfRectangle);
		
		Shape[] shapes2 = new Shape[5];
		shapes2[0] = new Circle("Red", 10);
		shapes2[1] = new Square("Blue", 20);
		shapes2[2] = new Cube("Yellow", 30);
		shapes2[3] = new Sphere("Green", 10);
		shapes2[4] = new Sphere("Cyan", 20);
		
		for(int i = 0; i < shapes2.length; i++) {
			System.out.println("### Shape2 " + i);
			System.out.println(shapes2[i]);
			System.out.println("############");
		}
	}
	
}



