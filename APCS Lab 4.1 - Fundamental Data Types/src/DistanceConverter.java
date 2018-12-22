public class DistanceConverter {

	public static void main(String[] args) {
		
		final int FEET_IN_YARDS = 3;
		final int INCHES_IN_FEET = 12;
		
		double yards = 3.5;
		double feet = yards * FEET_IN_YARDS;
		double inches = feet * INCHES_IN_FEET;
		
		System.out.println(yards + " yards are " + feet + " feet");
		System.out.println(yards + " yard are " + inches + " inches");
		
	}

}

/*
Output:
3.5 yards are 10.5 feet
3.5 yard are 126.0 inches
*/

/*
Changes I made:
- added spaces in printed strings
*/