import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
        frameExample.setSize(500, 500);
        frameExample.setLayout(new FlowLayout());

        JButton buttonOne = new JButton("YES");
        buttonOne.setBounds(0, 0, 50, 50);
        frameExample.add(buttonOne);

        JButton buttonTwo = new JButton("NO");
        buttonTwo.setBounds(100, 0, 50, 50);
        frameExample.add(buttonTwo);
       
        JButton buttonThree = new JButton("CANCEL");
        buttonThree.setBounds(150, 0, 80, 50);
        frameExample.add(buttonThree);

        frameExample.setVisible(true);
	}

}
