public class LoopStuff {

	public static void main(String[] args) {
		
		for (int i = 23; i <= 89; i++) {
			if ((i - 22) % 10 == 0) {
				System.out.println(i + " ");
			}
			else {
				System.out.print(i + " ");
			}
		}

	}

}
