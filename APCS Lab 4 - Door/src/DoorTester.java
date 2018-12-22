
public class DoorTester {

	public static void main(String[] args) {
		
		// test construction, getName(), and getState()
		Door houseDoor = new Door("front", "closed");
		System.out.println("The " + houseDoor.getName() + " door is " + houseDoor.getState());
		
		// test open() and close()
		houseDoor.open();
		System.out.println("The " + houseDoor.getName() + " door is " + houseDoor.getState());
		houseDoor.close();
		System.out.println("The " + houseDoor.getName() + " door is " + houseDoor.getState());
		
		// test setName() and setState()
		houseDoor.setName("back");
		System.out.println("The " + houseDoor.getName() + " door is " + houseDoor.getState());
		houseDoor.setState("open");
		System.out.println("The " + houseDoor.getName() + " door is " + houseDoor.getState());
		houseDoor.setState("closed");
		System.out.println("The " + houseDoor.getName() + " door is " + houseDoor.getState());

	}

}

// Expected output:
// The front door is closed
// The front door is open
// The front door is closed
// The back door is closed
// The back door is open
// The back door is closed

/* 
 * Actual output:
 * The front door is closed
 * The front door is open
 * The front door is closed
 * The back door is closed
 * The back door is open
 * The back door is closed
*/
