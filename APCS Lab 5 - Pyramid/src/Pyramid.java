public class Pyramid {
	
	private double height;
	private double baseLength;
	
	public Pyramid(double inHeight, double inBaseLength) {
		height = inHeight;
		baseLength = inBaseLength;
	}
	
	public double getVolume() {
		return baseLength * baseLength * height / 3;
	}
	
	public double getSurfaceArea() {
		return baseLength * baseLength + 2 * (baseLength * Math.sqrt(Math.pow(baseLength / 2, 2) + height * height));
	}
}
