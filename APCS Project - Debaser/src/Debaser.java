/**
 * This class converts a number with six or fewer digits between base-n and base-10.
 * @author Marin Hyatt & Celina Wu
 */
public class Debaser {
	
	private int num;
	
	/**
	 * Constructs a Debaser instance with an initial value of 0.
	 * (Written by Celina Wu)
	 */
	public Debaser() {
		num = 0;
	}
	
	/**
	 * Constructs a Debaser instance with a given initial value.
	 * (Written by Celina Wu)
	 * @param value the initial value
	 */
	public Debaser(int value) {
		num = value;
	}
	
	/**
	 * Sets the stored value to a given value.
	 * (Written by Celina Wu)
	 * @param value the given value
	 */
	public void setValue(int value) {
		num = value;
	}
	
	/**
	 * Returns the stored value.
	 * (Written by Celina Wu)
	 * @return the stored value
	 */
	public int getValue() {
		return num;
	}
	
	/**
	 * Converts the stored base-10 value to a given base between 2 and 9.
	 * (Written by Celina Wu)
	 * @param n the given base to be converted to
	 * @return the stored value written in the given base
	 */
	public int convertToBaseN(int n) {
		int result = (num % n);
		int storedValue = num / n;
		result += (storedValue % n) * 10;
		storedValue = storedValue / n;
		result += (storedValue % n) * 10 * 10;
		storedValue = storedValue / n;
		result += (storedValue % n) * Math.pow(10, 3);
		storedValue = storedValue / n;
		result += (storedValue % n) * Math.pow(10, 4);
		storedValue = storedValue / n;
		result += (storedValue % n) * Math.pow(10, 5);
		return result;
	}
	
	/**
	 * Converts the given base of the stored value into base-10.
	 * (Written by Marin Hyatt)
	 * @param n the given base to be converted from
	 * @return the stored value written in base-10
	 */
	public int convertToBaseTen(int n) {
		int result = num % 10;
		int storedValue = num / 10;
		result += (storedValue % 10) * Math.pow(n, 1);
		storedValue = storedValue / 10;
		result += (storedValue % 10) * Math.pow(n, 2);
		storedValue = storedValue / 10;
		result += (storedValue % 10) * Math.pow(n, 3);
		storedValue = storedValue / 10;
		result += (storedValue % 10) * Math.pow(n, 4);
		storedValue = storedValue / 10;
		result += (storedValue % 10) * Math.pow(n, 5);
		return result;
		
	}
}
