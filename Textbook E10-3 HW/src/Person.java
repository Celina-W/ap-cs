public class Person implements Measurable {
	
	private double height;
	private String name;

	public Person(double inHeight, String inName) {
		height = inHeight;
		name = inName;
	}
	
	public double getMeasure() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
}
