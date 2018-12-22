public class DataSet {

	private double sum, smallest, largest;
	private int numOfInputs;
	
	public DataSet() {
		sum = 0;
		numOfInputs = 0;
		smallest = Double.MAX_VALUE;
		largest = Double.MIN_VALUE;
	}
	
	public void add (double value) {
		sum += value;
		if (value < smallest) {
			smallest = value;
		}
		if (value > largest) {
			largest = value;
		}
		numOfInputs++;
	}
	
	public double getAverage() {
		if (numOfInputs > 0) {
			return sum / numOfInputs;
		}
		else {
			return 0;
		}
	}
	
	public double getSmallest() {
		if (numOfInputs > 0) {
			return smallest;
		}
		else {
			return 0;
		}
	}
	
	public double getLargest() {
		if (numOfInputs > 0) {
			return largest;
		}
		else {
			return 0;
		}
	}
	
	public double getRange() {
		if (numOfInputs > 0) {
			return largest - smallest;
		}
		else {
			return 0;
		}
	}
}
