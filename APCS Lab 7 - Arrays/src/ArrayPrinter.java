public class ArrayPrinter {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100 + 1);
		}

		System.out.print("Every element at an even index: ");
		for (int i = 0; i < nums.length; i += 2) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.print("\nEvery even element: ");
		for (int element : nums) {
			if (element % 2 == 0) {
				System.out.print(element + " ");
			}
		}
		
		System.out.print("\nEvery element in reverse order: ");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.print("\nOnly the first and last elements: ");
		System.out.print(nums[0] + " " + nums[nums.length - 1]);
	}

}
