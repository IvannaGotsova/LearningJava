import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frameExample = new JFrame();
	JLabel labelExample = new JLabel();
	
	NewWindow() {
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(500, 500);
		frameExample.setLayout(null);
		
		labelExample.setBounds(10, 10, 200, 200);
		labelExample.setText("New Window Opened!");
		frameExample.add(labelExample);
		
		frameExample.setVisible(true);
	}
}
