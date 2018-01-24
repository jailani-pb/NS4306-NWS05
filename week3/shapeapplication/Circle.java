package week3.shapeapplication;

public class Circle extends Shape{

	int radius;
	
	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}
	
	public int getArea() {
		return (int) (Math.PI * radius * radius);
	}

	public int getPerimeter() {
		return (int) (2 * Math.PI * radius);
	}
	
}
