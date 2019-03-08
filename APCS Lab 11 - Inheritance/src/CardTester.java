public class CardTester {

	public static void main(String[] args) {
		
		Card card = new Card("Antoine");
		IDCard idcard = new IDCard("Bob", 100);
		CallingCard callingcard = new CallingCard("Nancy", 000111001, 1234);
		DriverLicense license = new DriverLicense("Ruth", 5441, 2009);
		
		System.out.println(card.format());
		System.out.println(idcard.format());
		System.out.println(callingcard.format());
		System.out.println(license.format());
		System.out.println();
		
		System.out.println(card.isExpired());
		System.out.println(idcard.isExpired());
		System.out.println(callingcard.isExpired());
		System.out.println(license.isExpired());
		System.out.println();
		
		System.out.println(card.equals(license));
		DriverLicense license2 = new DriverLicense("Ruth", 5441, 2009);
		DriverLicense license3 = new DriverLicense("Ruth", 5441, 2020);
		System.out.println(license.equals(license2));
		System.out.println(license.equals(license3));
		System.out.println();
		
		System.out.println(license3.isExpired());
	}

}
