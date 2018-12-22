import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class HouseComponent extends JComponent {

	public void paintComponent (Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		Color brickRed = new Color(151, 102, 98);
		Color purpleRed = new Color(109, 76, 94);
		Color purple = new Color(51, 0, 101);
		
		// draw main body of castle
		g2.setColor(brickRed);
		Rectangle box = new Rectangle(300, 300, 375, 200);
		g2.fill(box);
		
		// draw protruding top walls
		box = new Rectangle(275, 250, 425, 50);
		g2.setColor(purpleRed);
		g2.fill(box);
		
		// draw staggered parapets on walls
		box = new Rectangle(275, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(325, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(375, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(425, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(375, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(425, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(475, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(525, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(575, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(625, 225, 25, 25);
		g2.fill(box);
		box = new Rectangle(675, 225, 25, 25);
		g2.fill(box);
		
		// draw opening of first window and window bars
		g2.setColor(purple);
		Ellipse2D.Double window = new Ellipse2D.Double(340, 320, 25, 75);
		g2.draw(window);
		g2.setColor(Color.WHITE);
		g2.fill(window);
		g2.setColor(purple);
		g2.draw(new Line2D.Double(365, 395, 340, 395));
		g2.draw(new Line2D.Double(352.5, 395, 352.5, 320));
		g2.draw(new Line2D.Double(340, 357.5, 365, 357.5));
		
		// draw openings of second window and window bars
		window = new Ellipse2D.Double(605, 320, 25, 75);
		g2.draw(window);
		g2.setColor(Color.WHITE);
		g2.fill(window);
		g2.setColor(purple);
		g2.draw(new Line2D.Double(630, 395, 605, 395));
		g2.draw(new Line2D.Double(617.5, 395, 617.5, 320));
		g2.draw(new Line2D.Double(605, 357.5, 630, 357.5));
		
		// draw door
		g2.fill(new Ellipse2D.Double(400, 350, 175, 300));

	}
}
