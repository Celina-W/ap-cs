
public class Month {

	private int month;
	
	public Month(int inMonth) {
		month = inMonth;
	}
	
	public int getLength() {
		if (month == 2) {
			return 28;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		else {
			return 31;
		}
	}
	
}
