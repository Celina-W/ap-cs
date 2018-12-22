import java.util.Scanner;

public class MonthTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a month: ");
		Month monthTest = new Month(in.nextInt());
		in.close();
		
		System.out.println(monthTest.getLength() + " days");

	}

}
