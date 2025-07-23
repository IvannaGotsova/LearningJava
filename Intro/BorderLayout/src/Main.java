import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(250, 250);
		frameExample.setLayout(new BorderLayout(5, 5));
		frameExample.setVisible(true);
		
		JPanel panelExampleOne = new JPanel();
		panelExampleOne.setBackground(Color.blue);
		frameExample.add(panelExampleOne, BorderLayout.NORTH);
		panelExampleOne.setPreferredSize(new Dimension(50, 50));
		
		JPanel panelExampleTwo = new JPanel();
		panelExampleTwo.setBackground(Color.green);
		frameExample.add(panelExampleTwo, BorderLayout.WEST);
		panelExampleTwo.setPreferredSize(new Dimension(50, 50));
		
		JPanel panelExampleThree = new JPanel();
		panelExampleThree.setBackground(Color.red);
		frameExample.add(panelExampleThree, BorderLayout.CENTER);
		panelExampleThree.setPreferredSize(new Dimension(50, 50));
		
		JPanel panelExampleFour = new JPanel();
		panelExampleFour.setBackground(Color.magenta);
		frameExample.add(panelExampleFour, BorderLayout.EAST);
		panelExampleFour.setPreferredSize(new Dimension(50, 50));
		
		JPanel panelExampleFive = new JPanel();
		panelExampleFive.setBackground(Color.cyan);
		frameExample.add(panelExampleFive, BorderLayout.SOUTH);
		panelExampleFive.setPreferredSize(new Dimension(50, 50));
	}

}
