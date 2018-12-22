public class CommonArrayStuff {

	public static void main(String[] args) {
		
		int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100};
		
		int searchedValue = 100;
		boolean found = false;
		
		int i;
		for (i = 0; i < values.length && !found; i++) {
			if (values[i] == searchedValue) {
				found = true;
			}
		}
		
		if (found) {
			// i is 1 higher than it should be! :((((
			System.out.println(i);
		}

	}

}
