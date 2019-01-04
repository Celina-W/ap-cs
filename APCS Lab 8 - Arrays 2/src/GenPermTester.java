import java.util.Scanner;

public class GenPermTester {

	public static void main(String[] args) {
		
		int length = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		if (in.hasNextInt()) 
		{
			length = in.nextInt();
		}
		in.close();
		
		GeneratePermutations generate = new GeneratePermutations();
		int[] arr = generate.generateArray(length);
		
		for (int i = 0; i < 10; i++) 
		{
			int[] permutedArr = generate.permuteArray(arr);
			for (int j = 0; j < length; j++) 
			{
				System.out.printf("%3d", permutedArr[j]);
			}
			System.out.println();
		}

	}

}
