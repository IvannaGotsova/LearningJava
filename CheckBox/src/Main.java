import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	JFrame frameExample = new JFrame();
		
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setLayout(new FlowLayout());
		
		JCheckBox checkBoxExample = new JCheckBox();
		frameExample.add(checkBoxExample);
		checkBoxExample.setText("This is Example");
		
		frameExample.pack();
		frameExample.setVisible(true);
		
	}
}
