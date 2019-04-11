public class RecursiveStuff {

	public static void main(String[] args) {
		int[] test = { 0, 1, 2 };
		System.out.println(sumArray(test));

	}
	
	public static int sumArray(int[] arr) {
		if (arr.length == 0) {
				return 0;
			}
			return sumArray(arr, 0, arr.length - 1);
		}

	private static int sumArray(int[] arr, int start, int end) {
		if (start == end) {
			return arr[start];
		}
		else {
			return sumArray(arr, start, (end + start) / 2) + sumArray(arr, ((start + end) / 2) + 1, end);
		}
	}

}
