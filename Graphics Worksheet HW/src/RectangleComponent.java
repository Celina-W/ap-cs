import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
	
	public void paintComponent (Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		/* Draw two squares
		
		Rectangle box = new Rectangle(5, 10, 20, 20);
		g2.draw(box);
		
		box.translate(15, 25);
		
		g2.draw(box); 
		
		*/
		
		// Draw a rectangle and a square
		Rectangle box = new Rectangle(5, 10, 10, 20);
		g2.draw(box);
		
		Rectangle square = new Rectangle(60, 60, 50, 50);
		g2.draw(square);
	
	}
}
