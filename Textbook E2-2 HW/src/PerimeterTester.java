import java.awt.Rectangle;

public class PerimeterTester {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		double perimeter = box.getWidth() * 2 + box.getHeight() * 2;
		System.out.println(perimeter);
		
	}

}

// Output:
// 100.0