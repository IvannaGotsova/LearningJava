import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
		JButton buttonExample = new JButton();
		buttonExample.setText("Right!");
		frameExample.add(buttonExample);
		
		buttonExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==buttonExample) {
                	System.out.println(checkBoxExample.isSelected());
                }
                	
            }
        });
		
		frameExample.pack();
		frameExample.setVisible(true);
		
	}
}
