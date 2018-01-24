package week3.shapeapplication;

public class Rectangle extends Shape {

	int height;
	int base;
	
	public Rectangle(String colour, int height, int base) {
		super(colour);
		this.height = height;
		this.base = base;
	}

	public int getArea() {
		return height * base;
	}
	
	public int getPerimeter() {
		return (2 * height) + (2 * base);
	}
	
}
