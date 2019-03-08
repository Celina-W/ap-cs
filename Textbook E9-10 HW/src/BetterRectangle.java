import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	
	public BetterRectangle(int inX, int inY, int inW, int inH) {
		// setLocation(inX, inY);
		// setSize(inW, inH);
		super(inX, inY, inW, inH);
	}
	
	public double getPerimeter() {
		return getWidth() * 2 + getHeight() * 2;
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	}
	
}
