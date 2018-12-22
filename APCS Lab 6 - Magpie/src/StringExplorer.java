/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		// indexOf returns -1 when the string is not found.
		int notfoundPsn = sample.indexOf("slow");
		System.out.println ("sample.indexOf(\"slow\") = " + notfoundPsn);
		int notfoundPsn2 = sample.indexOf("quick", 5);
		System.out.println ("sample.indexOf(\"quick\", 5) = " + notfoundPsn2);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);

	}

}
