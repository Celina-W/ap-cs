public class StringMeasurer implements Measurer {
	
	public double measure(Object anObject) {
		
		String aString = (String) anObject;
		double length = aString.length();
		return length;
		
	}
	
}
