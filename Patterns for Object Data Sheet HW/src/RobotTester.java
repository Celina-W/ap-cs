import java.awt.Point;

public class RobotTester {

	public static void main(String[] args) {
		
		Robot robo = new Robot();
		Point location = robo.getLocation();
		
		System.out.println("Expected output: 0,0");
		System.out.printf("Actual output: %.0f,%.0f\n\n", location.getX(), location.getY());
		
		System.out.println("Expected output: N");
		System.out.printf("Actual output: %s\n\n", robo.getDirection());
		
		robo.turnLeft();
		System.out.println("Expected output: W");
		System.out.printf("Actual output: %s\n\n", robo.getDirection());

		robo.turnRight();
		robo.turnRight();
		System.out.println("Expected output: E");
		System.out.printf("Actual output: %s\n\n", robo.getDirection());
		
		for (int i = 0; i < 5; i++) {
			robo.move();
		}
		robo.turnRight();
		for (int i = 0; i < 10; i++) {
			robo.move();
		}
		
		location = robo.getLocation();
		System.out.println("Expected output: 5,-10");
		System.out.printf("Actual output: %.0f,%.0f\n\n", location.getX(), location.getY());
	}

}
