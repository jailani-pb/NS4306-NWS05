package week4.shape2d3dapp;

public class Cube extends Shape implements Shape3D {

	int side;
	
	public Cube(String colour, int side) {
		super(colour);
		this.side = side;
	}

	@Override
	public int getVolume() {
		return side * side * side;
	}

	@Override
	public int getSurfaceArea() {
		return 6 * side * side;
	}

	@Override
	public String toString() {
		return "Cube [side=" + side + ", colour=" + colour + "]";
	}
	
}
