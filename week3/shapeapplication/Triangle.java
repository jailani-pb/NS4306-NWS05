package week3.shapeapplication;

public class Triangle extends Shape {

	int height;
	int base;
	
	public Triangle(String colour, int height, int base) {
		super(colour);
		this.height = height;
		this.base = base;
	}
	
	public int getArea() {
		return (int) (0.5 * base * height);
	}
	
	public int getPerimeter() {
		int c = (int) Math.sqrt((base*base) + (height*height));
		return base + height + c;
	}
	
}
