import java.awt.Rectangle;

public class AreaTester {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		double area = box.getWidth() * box.getHeight();
		System.out.println(area);

	}

}

// Output:
// 600.0