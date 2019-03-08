import java.util.Scanner;
import java.util.Arrays;

public class ArrayStuff {

	public static void main(String[] args) {
		
		double[] numbers = new double[1000];
		int counter = 0;
		
		double[] num = { 0.1, 2.0, 7.7, 3.4546, 5, 7.0 };
		
		System.out.println(Arrays.toString(num));
		
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
		
		int[] testArray = { 1, 10, 10, 2 };
		int count = 0;
		
		for (int i = 0; i < testArray.length; i++) {
			if (testArray[i] == 10) {
				count++;
				for (int j = i + 1; j < testArray.length; j++) {
					testArray[j-1] = testArray[j];
					System.out.println(Arrays.toString(testArray));
				}
				testArray[testArray.length-count] = 0;
				
			}
		}
		
		System.out.println(Arrays.toString(testArray));
		
	}

}
