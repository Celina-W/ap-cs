public class Pie implements MenuItem {

	private String name;
	private double price;
	
	public Pie(String inName, double inPrice) {
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
