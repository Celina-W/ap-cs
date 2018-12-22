import java.util.Scanner;

public class TestTwoReview {

	public static void main(String[] args) {
		
		final double EPSILON = 1E-14;
		
		int x = 0;
		int y = 0;
		
		if (x != y && y == 0 || x == 0) {
			System.out.println("exactly 1 is zero");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("p: ");
		boolean p = in.nextBoolean();
		System.out.print("q: ");
		boolean q = in.nextBoolean();
		System.out.print("r: ");
		boolean r = in.nextBoolean();
		in.close();
		
		
		System.out.println((p && q) || !r);
		System.out.println(!(p && (q || !r)));
		
		System.out.println("Epsilon: " + EPSILON);
		System.out.println("Int min value: " + Integer.MIN_VALUE);
		System.out.println("Byte max value: " + Byte.MAX_VALUE);
		
		String a = "Hello";
		String b = "Hi";
		
		String aSub = a.substring(0,1) + a.substring(a.length() - 1);
		String bSub = b.substring(0,1) + b.substring(b.length() - 1);
		
		if (a.compareTo(b) < 0) {
			System.out.println(aSub + bSub + aSub);
		}
		else {
			System.out.println(bSub + aSub + bSub);
		}
		

	}

}
