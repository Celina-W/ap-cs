public class Balloon {
	
	private double volume; // in cubed cm
	
	public void addAir(double amount) {
		volume += amount;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * getRadius() * getRadius();
	}
	
	public double getRadius() {
		return Math.cbrt(3 / (4 * Math.PI) * volume);
	}
}
