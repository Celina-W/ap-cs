import java.util.Scanner;

public class PyramidTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pyramid: ");
		double height = in.nextDouble();
		System.out.print("Enter the base length of the pyramid: ");
		double baseLength = in.nextDouble();
		in.close();
		
		Pyramid pyramid = new Pyramid(height, baseLength);
		
		System.out.println("The volume of the pyramid is: " + pyramid.getVolume());
		System.out.println("The surface area of the pyramid is: " + pyramid.getSurfaceArea());
		
	}

}
