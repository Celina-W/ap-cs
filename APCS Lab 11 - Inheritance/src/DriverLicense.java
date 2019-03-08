import java.util.Calendar;
import java.util.GregorianCalendar;

public class DriverLicense extends IDCard {

	private int expYear;
	
	public DriverLicense(String n, int inId, int inYear) {
		super(n, inId);
		expYear = inYear;
	}
	
	public String format() {
		return super.format() + "\nExpiration year: " + expYear;
	}
	
	public boolean isExpired() {
		GregorianCalendar calendar = new GregorianCalendar();
		return expYear < calendar.get(Calendar.YEAR);
	}
	
	public String toString() {
		return super.toString() + " [expYear=" + expYear + "]";
	}
	
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject)) {
			return false;
		}
		DriverLicense other = (DriverLicense) otherObject;
		return expYear == other.expYear;
	}
	
}
