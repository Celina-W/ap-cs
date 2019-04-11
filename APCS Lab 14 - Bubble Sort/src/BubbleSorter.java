//import java.util.Arrays;

public class BubbleSorter {
	
//	public static void main(String[] args) {
//		int[] test = new int[] { 1, 2, 7, 4, 6, 3, 5 };
//		sort(test);
//		System.out.println(Arrays.toString(test));
//	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void sort(int[] arr) {
		boolean done = false;
		int passes = 0;
		while (!done) {
			done = true;
			for (int i = 0 + passes; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					done = false;
				}
			}
			passes++;
		}
	}
	
}
