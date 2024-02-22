import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(500, 500);
		frameExample.setLayout(null);
		
		JPanel panelExampleOne = new JPanel();
		panelExampleOne.setBounds(0, 0, 250, 250);
		panelExampleOne.setBackground(Color.blue);
		panelExampleOne.setLayout(null);
		frameExample.add(panelExampleOne);
		
		JPanel panelExampleTwo= new JPanel();
		panelExampleTwo.setBounds(0, 250, 250, 250);
		panelExampleTwo.setBackground(Color.green);
		panelExampleTwo.setLayout(null);
		frameExample.add(panelExampleTwo);
		
		JPanel panelExampleThree = new JPanel();
		panelExampleThree.setBounds(250, 0, 250, 250);
		panelExampleThree.setBackground(Color.CYAN);
		panelExampleThree.setLayout(null);
		frameExample.add(panelExampleThree);
		
		JPanel panelExampleFour = new JPanel();
		panelExampleFour.setBounds(250, 250, 250, 250);
		panelExampleFour.setBackground(Color.MAGENTA);
		panelExampleFour.setLayout(null);
		frameExample.add(panelExampleFour);
		

		frameExample.setVisible(true);
		
	}

}
