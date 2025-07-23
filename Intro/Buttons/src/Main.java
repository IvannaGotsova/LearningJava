import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jframeExample = new JFrame();

		jframeExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframeExample.setLayout(null);
		
		Container contentPane = jframeExample.getContentPane();
		
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(0, 0, 100, 70);
		contentPane.add(closeButton);
		
		closeButton.addActionListener((ActionListener) new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(jframeExample, "Button Close Clicked!");
	                System.out.println("Button Close Clicked!");
	            }
	        });
		 
		JButton okButton   = new JButton("OK");
		okButton.setBounds(250, 0, 100, 70);
		contentPane.add(okButton);

		okButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jframeExample, "Button Open Clicked!");
                System.out.println("Button Open Clicked!");
            }
        });
	 
		jframeExample.setVisible(true);
		
	}

}
