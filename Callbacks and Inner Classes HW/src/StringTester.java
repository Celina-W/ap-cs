public class StringTester {
	
	// average method
	public static double average(Object[] objects, Measurer meas) {
		
		double sum = 0;
		for (Object obj : objects) {
			sum = sum + meas.measure(obj);
		}
		
		if (objects.length > 0) { return sum / objects.length; }
		else { return 0; }
		
	}
	
	public static void main(String[] args) {
		
		// inner class, only main needs it
		class StringMeasurer implements Measurer {
			
			public double measure(Object anObject) {
				
				String aString = (String) anObject;
				double length = aString.length();
				return length;
				
			}
			
		}
		
		// testing
		Measurer stringMeas = new StringMeasurer();
		
		String[] strings = new String[]
				{
						"john",
						"dolphin",
						"strange",
						"tired",
						"unfortunate"
				};
		
		double averageLength = average(strings, stringMeas);
		System.out.println("Average length: " + averageLength);
		System.out.println("Expected length: 6.8");

	}

}
