import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a new JFrame
        JFrame frameExample = new JFrame("My First Frame Example");
 
        // Set frame properties
        frameExample.setSize(500, 500); // Set the size of the frame
        frameExample.setLocationRelativeTo(null); //set your frame on the screen
        frameExample.getContentPane().setBackground(Color.BLUE); // Set the background to blue
        frameExample.getContentPane().setBackground(new Color(0, 206, 250)); // Set the background to custom blue color
         
        // Close operation
        frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Make the frame visible
        frameExample.setVisible(true);
    }

}
