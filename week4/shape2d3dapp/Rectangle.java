package week4.shape2d3dapp;

public class Rectangle extends ShapeUI implements Shape2D {

	int base;
	int height;
	
	public Rectangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}

	public int getArea() {
		return height * base;
	}
	
	public int getPerimeter() {
		return (2 * height) + (2 * base);
	}

	@Override
	public String toString() {
		return "Rectangle [base=" + base + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
	
}
