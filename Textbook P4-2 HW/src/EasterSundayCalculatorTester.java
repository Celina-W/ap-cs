import java.util.Scanner;

public class EasterSundayCalculatorTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("The year is: ");
		int year = in.nextInt();
		in.close();
		
		EasterSundayCalculator calculator = new EasterSundayCalculator(year);
		calculator.calculateDate();

	}

}
