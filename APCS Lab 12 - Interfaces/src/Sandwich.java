public class Sandwich implements MenuItem {

	private String name;
	private double price;
	
	public Sandwich(String inName, double inPrice) {
		name = inName;
		price = inPrice;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
