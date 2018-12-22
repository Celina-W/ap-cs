import java.util.Scanner;

public class ArrayStuff {

	public static void main(String[] args) {
		
		double[] numbers = new double[1000];
		int counter = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers, q to quit: ");
		while (in.hasNextDouble()) {
			numbers[counter] = in.nextDouble();
			counter++;
		}
		in.close();
		
		if (counter > 0) {
			
			int largestIndex = 0;
			for (int i = 1; i < counter; i++) {
				if (numbers[largestIndex] < numbers[i]) {
					largestIndex = i;
				}
			}
			
			for (int i = 0; i < counter; i++) {
				System.out.print(numbers[i]);
				if (i == largestIndex) {
					System.out.println(" <= largest value");
				}
				else {
					System.out.println();
				}
			}
		}
		
	}

}
