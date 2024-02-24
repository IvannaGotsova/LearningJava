import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setLayout(new FlowLayout());
		
		JTextField fieldTextExample = new JTextField();
		fieldTextExample.setPreferredSize(new Dimension(100, 50));
		frameExample.add(fieldTextExample);
		
		frameExample.pack();
		frameExample.setVisible(true);
	}

}
