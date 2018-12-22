public class UndoTester {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		System.out.println(counter.getValue());
		counter.click();
		System.out.println(counter.getValue());
		counter.undo();
		System.out.println(counter.getValue());
		counter.undo();
		System.out.println(counter.getValue());

	}

}

// Expected Output:
// 0
// 1
// 0
// 0

// Actual Output:
// 0
// 1
// 0
// 0