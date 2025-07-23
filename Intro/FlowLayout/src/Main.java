import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(250, 250);
		frameExample.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5 ));
		frameExample.setVisible(true);
		
		JPanel panelExampleOne = new JPanel();
		panelExampleOne.setBackground(Color.blue);
		panelExampleOne.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleOne);
		
		JPanel panelExampleTwo = new JPanel();
		panelExampleTwo.setBackground(Color.green);
		panelExampleTwo.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleTwo);
		
		JPanel panelExampleThree = new JPanel();
		panelExampleThree.setBackground(Color.red);
		panelExampleThree.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleThree);
		
		JPanel panelExampleFour = new JPanel();
		panelExampleFour.setBackground(Color.magenta);
		panelExampleFour.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleFour);
		
		JPanel panelExampleFive = new JPanel();
		panelExampleFive.setBackground(Color.cyan);
		panelExampleFive.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleFive);
		
		JPanel panelExampleSix = new JPanel();
		panelExampleSix.setBackground(Color.yellow);
		panelExampleSix.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleSix);
		
		JPanel panelExampleSeven = new JPanel();
		panelExampleSeven.setBackground(Color.black);
		panelExampleSeven.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleSeven);
		
		JPanel panelExampleEight = new JPanel();
		panelExampleEight.setBackground(Color.white);
		panelExampleEight.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleEight);
		
		JPanel panelExampleNine = new JPanel();
		panelExampleNine.setBackground(Color.gray);
		panelExampleNine.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleNine);
		
		JPanel panelExampleTen = new JPanel();
		panelExampleTen.setBackground(Color.pink);
		panelExampleTen.setPreferredSize(new Dimension(50, 50));
		frameExample.add(panelExampleTen);

	}	

}
