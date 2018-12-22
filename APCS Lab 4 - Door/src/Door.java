/**
 * This class models a door that can be opened or closed.
 * @author Celina Wu
 */
public class Door {
	
	private String name;
	private String state;
	
	/**
	 * Constructs a door object with the given name and state.
	 * @param doorName the name of the door
	 * @param initialState whether the door is opened or closed
	 */
	public Door(String doorName, String initialState) {	
		name = doorName;
		state = initialState;
	}
	
	/**
	 * Opens the door.
	 */
	public void open() {
		state = "open";
	}
	
	/**
	 * Closes the door.
	 */
	public void close() {
		state = "closed";
	}
	
	/**
	 * Returns the name of the door.
	 * @return the name of the door
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Rename the door with a given name.
	 * @param newName the new name of the door
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the state of the door.
	 * @return the state of the door
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the door to a given state.
	 * @param newState the new state of the door
	 */
	public void setState(String newState) {
		state = newState;
	}
	
}
