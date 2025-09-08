import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(500, 500);
		frameExample.setLayout(null);
		
		JLayeredPane jLayeredPane = new JLayeredPane();
		jLayeredPane.setBounds(0, 0, 250, 250);
		
		JPanel panelExampleOne = new JPanel();
		panelExampleOne.setBackground(Color.blue);
		panelExampleOne.setOpaque(true);
		panelExampleOne.setBounds(50, 50, 100, 100);
		jLayeredPane.add(panelExampleOne, Integer.valueOf(0));
		
		JPanel panelExampleTwo = new JPanel();
		panelExampleTwo.setBackground(Color.green);
		panelExampleTwo.setOpaque(true);
		panelExampleTwo.setBounds(100, 100, 100, 100);
		jLayeredPane.add(panelExampleTwo, Integer.valueOf(1));
		
		JPanel panelExampleThree = new JPanel();
		panelExampleThree.setBackground(Color.red);
		panelExampleThree.setOpaque(true);
		panelExampleThree.setBounds(150, 150, 100, 100);
		jLayeredPane.add(panelExampleThree, Integer.valueOf(2));
		
		frameExample.add(jLayeredPane);
		frameExample.setVisible(true);
	}

}
