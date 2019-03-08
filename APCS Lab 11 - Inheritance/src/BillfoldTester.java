public class BillfoldTester {

	public static void main(String[] args) {
		
		Billfold billfold = new Billfold();
		CallingCard calling = new CallingCard("Page", 600601, 2015);
		DriverLicense license = new DriverLicense("Brin", 600673, 1998);
		
		billfold.addCard(calling);
		billfold.addCard(license);
		
		System.out.println(billfold.formatCards());
		/* This demonstrates polymorphism because the two Card subclass objects
		 * are being stored in Card variables. Despite that, the format() method
		 * call works on both of them because it is a method in the Card class,
		 * yet the two subclasses call their respective override format() methods.
		 * The two subclass objects are taking on "multiple forms": the forms being
		 * themselves and their superclass.
		 */
		
		System.out.println("Expected output: 1");
		System.out.printf("Actual output: %d\n", billfold.getExpiredCardCount());
		
	}

}
