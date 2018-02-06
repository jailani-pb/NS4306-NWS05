package week4.shape2d3dapp;

public class Sphere extends Shape implements Shape3D {

	int radius;
	
	public Sphere(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	@Override
	public int getVolume() {
		return (int) (4 / 3 * Math.PI * radius * radius * radius);
	}

	@Override
	public int getSurfaceArea() {
		return (int) (4 * Math.PI * radius * radius);
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ", colour=" + colour + "]";
	}

	
}
