import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setLayout(new FlowLayout());
		
		JTextField fieldTextExample = new JTextField();
		fieldTextExample.setPreferredSize(new Dimension(100, 500));
		fieldTextExample.setColumns(3);
		fieldTextExample.setBackground(Color.yellow);
		fieldTextExample.setForeground(Color.blue);
		fieldTextExample.setFont(new Font("Times New Roman", Font.BOLD, 12));
		frameExample.add(fieldTextExample);
		
		frameExample.pack();
		frameExample.setVisible(true);
	}

}
