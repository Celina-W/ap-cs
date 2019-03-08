public class SimilarityFinderTester {

	public static void main(String[] args) {
		
		SimilarityFinder tester = new SimilarityFinder();
		
		int[][] testArr = 
		{
			{0, 1, 5},
			{2, 4, 7},
			{6, 10, 10}
		};
		
		System.out.println(tester.findSimilar(testArr));

	}

}
