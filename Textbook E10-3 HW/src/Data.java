public class Data 
{
	/** Computes the average of the measures of the given objects.
	 	@param objects an array of Measurable objects
	 	@return the average of the measures
	*/
	public static double average(Measurable[] objects) {
		double sum = 0;
		for (Measurable obj: objects) {
			sum = sum + obj.getMeasure();
		} 
		if(objects.length > 0) { 
			return sum / objects.length; 
		}
		else { 
			return 0; 
		}
	}
	
	public static Measurable max(Measurable[] objects) {
		Measurable maximum = objects[0];
		for (int i = 1; i < objects.length; i++) {
			if (objects[i].getMeasure() > maximum.getMeasure()) {
				maximum = objects[i];
			}
		}
		return maximum;
	}

}
