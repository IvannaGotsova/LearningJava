import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

	JFrame frameExample = new JFrame();
	JButton buttonExample = new JButton();
	
	LaunchPage(){	
		
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(500, 500);
		frameExample.setLayout(null);
			
		buttonExample.setBounds(100, 100, 100, 100);
		buttonExample.setFocusable(false);
		buttonExample.addActionListener(this);
		buttonExample.setText("Click me");
		frameExample.add(buttonExample);
		
		frameExample.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==buttonExample) {
			frameExample.dispose();
			
			String urlToOpen = "https://github.com/IvannaGotsova";

	        try {
	            Desktop.getDesktop().browse(new URI(urlToOpen));
	        } catch (Exception ex) {
	            System.err.println("Error opening URL: " + ex.getMessage());
	        }
		}
	}
}
