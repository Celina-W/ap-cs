public class TrioTester {

	public static void main(String[] args) {
		
		Sandwich cheeseburger = new Sandwich("Cheeseburger", 2.75);
		Sandwich club = new Sandwich("Club Sandwich", 2.75);
		Pie spinach = new Pie("Spinach Pie", 1.25);
		Pie apple = new Pie("Apple Pie", 1.25);
		Drink orange = new Drink("Orange Soda", 1.25);
		Drink cappuccino = new Drink("Cappuccino", 3.50);
		
		MenuItem[] trioMenu = {
				new Trio(cheeseburger, spinach, orange),
				new Trio(club, apple, cappuccino),
				new Trio(club, spinach, cappuccino)
		};
		
		double totalCost = ((Trio) trioMenu[0]).getPrice() + ((Trio) trioMenu[1]).getPrice() + ((Trio) trioMenu[2]).getPrice();
		
//		System.out.println("Expected output:");
//		System.out.println("Cheeseburger/Spinach Pie/Orange Soda Trio: 4.00");
//		System.out.println("Club Sandwich/Apple Pie/Cappuccino Trio: 6.25");
//		System.out.println("Club Sandwich/Spinach Pie/Cappuccino Trio: 6.25");
//		System.out.println("Total: 16.50");
//		
//		System.out.println("Actual output:");
		System.out.printf("%s: %.2f\n", ((Trio) trioMenu[0]).getName(), ((Trio) trioMenu[0]).getPrice());
		System.out.printf("%s: %.2f\n", ((Trio) trioMenu[1]).getName(), ((Trio) trioMenu[1]).getPrice());
		System.out.printf("%s: %.2f\n", ((Trio) trioMenu[2]).getName(), ((Trio) trioMenu[2]).getPrice());
		System.out.printf("Total: %.2f", totalCost);
		
	}

}
