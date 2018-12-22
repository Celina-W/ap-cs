import java.util.Scanner;

public class CompassDirection {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an angle (0-360): ");
		double angle = in.nextDouble();
		in.close();
		
		if (292.5 <= angle && angle <= 22.5) {
			System.out.println("N");
		}
		
	}

}
