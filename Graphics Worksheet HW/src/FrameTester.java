import javax.swing.JFrame;

public class FrameTester {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setTitle("Hello, World!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JFrame frame1 = new JFrame();
		frame1.setSize(400, 400);
		frame1.setTitle("Bonjour, le monde!");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		
	}

}
