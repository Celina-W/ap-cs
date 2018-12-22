import java.util.Scanner;

public class StateOfMatter {

	public static void main(String[] args) {
		
		double boilpt = 100;
		double temp = 0;
		double altitude = 0;
		String system = null;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		if (in.hasNextDouble()) {
			temp = in.nextDouble();
		}
		else {
			System.out.println("Error: Invalid input");
			System.exit(0);
		}
		
		System.out.print("Is this in Farenheit or Celsius (F/C)?: ");
		system = in.next();
		if (system.equals("F")) {
			temp = (temp - 32) * 5 / 9;
		}
		else if (!system.equals("C")) {
			System.out.println("Error: Invalid input");
			System.exit(0);
		}
		
		System.out.print("Enter an altitude: ");
		if (in.hasNextDouble()) {
			altitude = in.nextDouble();
			if (altitude < 0) {
				System.out.println("Error: Altitude must be greater than 0");
				System.exit(0);
			}
		}
		else {
			System.out.println("Error: Invalid input");
			System.exit(0);
		}
		
		in.close();
		boilpt -= altitude / 300;
		
		if (temp <= 0) {
			System.out.println("solid");
		}
		else if (temp < boilpt) {
			System.out.println("liquid");
		}
		else {
			System.out.println("gas");
		}

	}

}
