import javax.swing.JFrame;

public class TwoSquareTester {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Two Squares");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		
		frame.setVisible(true);
		
	}

}
