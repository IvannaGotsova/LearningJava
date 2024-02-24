import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        JFrame frameExample = new JFrame();
		
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setLayout(new FlowLayout());
		
		String[] numbers = {"one", "two", "three", "four", "five"};	
		JComboBox comboBoxExample = new JComboBox(numbers);
		frameExample.add(comboBoxExample); 
		
		comboBoxExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==comboBoxExample) {
                	System.out.println(comboBoxExample.getSelectedItem());
                }
                	
            }
        });
		
		frameExample.pack();
		frameExample.setVisible(true);
		
	}

}
