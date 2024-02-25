import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        JFrame frameExample = new JFrame();
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setLayout(new FlowLayout());
		
		JLabel labelExample = new JLabel();
		labelExample.setBackground(Color.yellow);
		labelExample.setOpaque(true);
		frameExample.add(labelExample);
		labelExample.setText("This is Example");
		
		JButton buttonExample = new JButton();
		buttonExample.setText("Right!");
		frameExample.add(buttonExample);
		
		buttonExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==buttonExample) {
                	JColorChooser colorChooserExample = new JColorChooser();
                	Color color = JColorChooser.showDialog(null, "Color", Color.black);
                	labelExample.setBackground(color);
                	System.out.println("Button clicked");
                }
                	
            }
        });
		
		frameExample.pack();
		frameExample.setVisible(true);
	}

}
