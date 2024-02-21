import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.GridLayout;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a new JFrame
        JFrame frameExample = new JFrame("My First Frame Example");
 
        // Create a new JLabel
        JLabel labelExample = new JLabel("My First Label Example");
 
        // Add the label to the frame
        frameExample.add(labelExample);
        
        // Set frame properties
        frameExample.setSize(500, 500); // Set the size of the frame
        frameExample.setLocationRelativeTo(null); //set your frame on the screen
        frameExample.getContentPane().setBackground(Color.BLUE); // Set the background to blue
        frameExample.getContentPane().setBackground(new Color(0, 206, 250)); // Set the background to custom blue color
         
        // Create a menu bar
        JMenuBar menuBarExample = new JMenuBar();
        JMenu fileMenuExample = new JMenu("File");
        JMenuItem openItemExample = new JMenuItem("Open");
        JMenuItem exitItemExample = new JMenuItem("Exit");
        fileMenuExample.add(openItemExample);
        fileMenuExample.addSeparator();
        fileMenuExample.add(openItemExample);
        menuBarExample.add(exitItemExample);
        
        // Close operation
        frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Make the frame visible
        frameExample.setVisible(true);
    }

}
