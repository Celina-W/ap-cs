import java.awt.Point;

public class PointTester {

	public static void main(String[] args) {
		
		Point point1 = new Point(3, 4);
		Point point2 = new Point(-3, -4);
		System.out.println("Expected value: 10.0");
		System.out.println("Calculated value: " + point1.distance(point2));
		
	}

}

// Expected value: 10.0
// Calculated value: 10.0