public class Person implements Measurable, Comparable {
	
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
	
	public int compareTo(Object otherObject) {
		Person otherPerson = (Person) otherObject;
		return name.compareTo(otherPerson.name);
	}
	
}