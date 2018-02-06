package week4.improvedshapeapp;

public abstract class Shape {

	String colour;
	
	public Shape(String colour) {
		this.colour = colour;
	}
	
	public abstract int getArea();
	public abstract int getPerimeter();
	
}
