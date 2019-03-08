import java.util.ArrayList;

public class BobRemover {

	public ArrayList<Character> removeBob(ArrayList<Character> arr) {
		
		int i = 1;
		
		while (i < arr.size() - 1) 
		{
			if (arr.get(i - 1) != arr.get(i) && arr.get(i - 1) == arr.get(i + 1)) 
			{
				arr.remove(i);
			}
			else 
			{
				i++;
			}
		}
		
		return arr;
		
	}
	
}
