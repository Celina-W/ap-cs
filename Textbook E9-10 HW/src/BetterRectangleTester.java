public class BetterRectangleTester {

	public static void main(String[] args) {
		
		BetterRectangle test = new BetterRectangle(0,0,5,7);
		System.out.println("Expected output perimeter: 24");
		System.out.printf("Actual output perimeter: %1.0f\n", test.getPerimeter());
		System.out.println("Expected output area: 35");
		System.out.printf("Actual output area: %1.0f\n", test.getArea());

	}

}
