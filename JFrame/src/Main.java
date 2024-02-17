import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jframeExample = new JFrame();

		jframeExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeExample.setBounds(250, 250, 250, 250);
		
		Container contentPane = jframeExample.getContentPane();
		JButton closeButton = new JButton("Close");
		contentPane.add(closeButton);
		JButton okButton   = new JButton("OK");
		contentPane.add(okButton);
		
		jframeExample.pack();
		jframeExample.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		jframeExample.setVisible(true);
		
	}

}
