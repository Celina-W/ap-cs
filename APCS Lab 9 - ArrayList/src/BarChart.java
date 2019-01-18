import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		
		System.out.print("Enter a value, q to quit: ");
		while (in.hasNextInt()) {
			int number = in.nextInt();
			data.add(number);
			if (number > max) {
				max = number;
			}
		}
		
		in.close();
		
		for (int i = 0; i < data.size(); i++) {
			int asteriskCount = (int) Math.round(data.get(i) * 1.0 / max * 40);
			for (int j = 0; j < asteriskCount; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
