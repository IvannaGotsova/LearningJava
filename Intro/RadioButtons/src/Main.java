import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setLayout(new FlowLayout());
		
		JRadioButton radioButtonExampleOne = new JRadioButton("Number One");
		JRadioButton radioButtonExampleTwo = new JRadioButton("Number Two");
		JRadioButton radioButtonExampleThree = new JRadioButton("Number Three");
		JRadioButton radioButtonExampleFour = new JRadioButton("Number Four");
		JRadioButton radioButtonExampleFive = new JRadioButton("Number Five");
		
		ButtonGroup groupExample = new ButtonGroup();
		groupExample.add(radioButtonExampleOne);
		groupExample.add(radioButtonExampleTwo);
		groupExample.add(radioButtonExampleThree);
		groupExample.add(radioButtonExampleFour);
		groupExample.add(radioButtonExampleFive);
		
		frameExample.add(radioButtonExampleOne);
		frameExample.add(radioButtonExampleTwo);
		frameExample.add(radioButtonExampleThree);
		frameExample.add(radioButtonExampleFour);
		frameExample.add(radioButtonExampleFive);
		
		JButton buttonExample = new JButton();
		buttonExample.setText("Right!");
		frameExample.add(buttonExample);
		
		buttonExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(radioButtonExampleOne.isSelected()) {
               	 System.out.println("You choose number One!");
              } else if(radioButtonExampleTwo.isSelected()) {
              	 System.out.println("You choose number Two!");
              } else if(radioButtonExampleThree.isSelected()) {
               	 System.out.println("You choose number Three!");
              } else if(radioButtonExampleFour.isSelected()) {
                	 System.out.println("You choose number Four!");
              } else {
               	 System.out.println("You choose number Five!");
               }
            
                	
            }
        });
		
		frameExample.pack();
		frameExample.setVisible(true);
	}

}
