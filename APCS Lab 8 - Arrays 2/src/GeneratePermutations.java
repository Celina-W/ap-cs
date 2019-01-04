public class GeneratePermutations {

	public int[] generateArray(int n) {
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) 
		{
			num[i] = i + 1;
		}
		
		return num;
	}
	
	public int[] permuteArray(int[] input) {
		int[] values = new int[input.length];
		
		for (int i = 0; i < input.length; i++) 
		{
			values[i] = input[i];
		}
		
		int[] permutation = new int[values.length];
		
		for (int i = 0; i < permutation.length; i++) 
		{
			int randomIndex = (int) (Math.random() * (values.length - i));
			permutation[i] = values[randomIndex];
			values[randomIndex] = values[values.length - 1 - i];
		}
		
		return permutation;
	}
	
}
