import java.util.Scanner;

public class DataSetTester {

	public static void main(String[] args) {
		
		DataSet dataset = new DataSet();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter numbers, q to quit: ");
		
		while (in.hasNextDouble()) {
			double num = in.nextDouble();
			dataset.add(num);
			System.out.print("                          ");
		}
		
		in.close();
		
		System.out.println("Average: " + dataset.getAverage());
		System.out.println("Smallest: " + dataset.getSmallest());
		System.out.println("Largest: " + dataset.getLargest());
		System.out.println("Range: " + dataset.getRange());

	}

}
