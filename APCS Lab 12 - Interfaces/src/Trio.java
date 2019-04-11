public class Trio implements MenuItem {
	
	private String name;
	private double price;
	
	public Trio(Sandwich sandwich, Pie pie, Drink drink) {
		name = sandwich.getName() + "/" + pie.getName() + "/" + drink.getName() + " Trio";
		double priceOff = Math.min(sandwich.getPrice(), Math.min(pie.getPrice(), drink.getPrice()));
		price = sandwich.getPrice() + pie.getPrice() + drink.getPrice() - priceOff;	
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
}
