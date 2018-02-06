package week4.shape2d3dapp;

public class Square extends Shape implements Shape2D {

	int side;
	
	public Square(String colour, int side) {
		super(colour);
		this.side = side;
	}

	public int getArea() {
		return side * side;
	}
	
	public int getPerimeter() {
		return 4 * side;
	}
	
	@Override
	public String toString() {
		return "Square [side=" + side + ", colour=" + colour + "]";
	}
	
}
