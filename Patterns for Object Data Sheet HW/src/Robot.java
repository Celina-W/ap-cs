import java.awt.Point;

public class Robot {
	
	private int x, y;
	private int direction;
	
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	public Robot() {
		x = 0;
		y = 0;
		direction = NORTH;
	}
	
	public void turnLeft() {
		if (direction == NORTH) {
			direction = WEST;
		}
		else {
			direction--;
		}
	}
	
	public void turnRight() {
		if (direction == WEST) {
			direction = NORTH;
		}
		else {
			direction++;
		}
	}
	
	public void move() {
		if (direction == NORTH) {
			y++;
		}
		else if (direction == EAST) {
			x++;
		}
		else if (direction == SOUTH) {
			y--;
		}
		else {
			x--;
		}
	}
	
	public Point getLocation() {
		return new Point(x, y);
	}
	
	public String getDirection() {
		if (direction == NORTH) {
			return "N";
		}
		else if (direction == EAST) {
			return "E";
		}
		else if (direction == SOUTH) {
			return "S";
		}
		else {
			return "W";
		}
	}
	
}
