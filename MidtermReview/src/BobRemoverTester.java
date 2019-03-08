import java.util.ArrayList;

public class BobRemoverTester {

	public static void main(String[] args) {
		
		BobRemover tester = new BobRemover();
		ArrayList<Character> testArr = new ArrayList<Character>();
		testArr.add('b');
		testArr.add('o');
		testArr.add('b');
		
		System.out.println(tester.removeBob(testArr));

	}

}
