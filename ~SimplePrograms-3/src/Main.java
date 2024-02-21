import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JMenu fileMenuExample = new JMenu("Main");
        JMenuItem openItemExample = new JMenuItem("Open");
        JMenuItem saveItemExample = new JMenuItem("Save");
        JMenuItem exitItemExample = new JMenuItem("Exit");
        fileMenuExample.add(openItemExample);
        fileMenuExample.add(saveItemExample);
        fileMenuExample.add(exitItemExample);
        menuBarExample.add(fileMenuExample);
        frameExample.setJMenuBar(menuBarExample);
        
        // Create a panel with a button
        JPanel panelExample = new JPanel();
        JButton buttonExample = new JButton("Click Me");
        panelExample.add(buttonExample);  
        frameExample.add(buttonExample);
        
        // Add action to the button
        buttonExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frameExample, "Button Clicked!");
            }
        });
        
        // Add action to the Open button
        openItemExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frameExample, "Button Opened!");
            }
        });
        
        // Add action to the Save button
        saveItemExample.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frameExample, "Button Saved!");
            }
        });
        
        // Close operation
        frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Make the frame visible
        frameExample.setVisible(true);
    }

}
