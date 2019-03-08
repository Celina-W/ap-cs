public class SimilarityFinder {

	public int findSimilar(int[][] arr) {
		
		int rowCount = 0, columnCount = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[0].length - 1; j++) 
			{
				if (Math.abs(arr[i][j] - arr[i][j + 1]) <= 2) 
				{
					rowCount++;
				}
			}
		}
		
		for (int j = 0; j < arr[0].length; j++) 
		{
			for (int i = 0; i < arr.length - 1; i++)
			{
				if (Math.abs(arr[i][j] - arr[i + 1][j]) <= 3) 
				{
					columnCount++;
				}
			}
		}
		
		return rowCount * columnCount;
		
	}
	
}
