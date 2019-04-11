import java.util.Arrays;

public class SortingStuff {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(selectionSort(new int[] {11,9,17,5,12} )));
		System.out.println(Arrays.toString(maxSelectionSort(new int[] {11,9,17,5,12} )));
	}
	
	public static int[] selectionSort(int[] arr) {
		for (int n = 0; n < arr.length - 1; n++) {
			int minIndex = n;
			for (int i = n + 1; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int swap = arr[n];
			arr[n] = arr[minIndex];
			arr[minIndex] = swap;
		
		}
		
		return arr;
	}
	
	public static int[] maxSelectionSort(int[] arr) {
		for (int n = 0; n < arr.length - 1; n++) {
			int maxIndex = n;
			for (int i = n + 1; i < arr.length; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
			}
			int swap = arr[n];
			arr[n] = arr[maxIndex];
			arr[maxIndex] = swap;
		
		}
		
		return arr;
	}
	
	
}
