import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameExample = new JFrame();
		frameExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameExample.setSize(500, 500);
		frameExample.setLayout(new FlowLayout());
		
		JMenuBar menuBarExample = new JMenuBar();
		frameExample.setJMenuBar(menuBarExample);
		
		JMenu openMenuExample = new JMenu("Open");
		JMenu saveMenuExample = new JMenu("Save");
		JMenu editMenuExample = new JMenu("Edit");
		JMenu closeMenuExample = new JMenu("Close");
		JMenu helpMenuExample = new JMenu("Help");
		menuBarExample.add(openMenuExample);
		menuBarExample.add(saveMenuExample);
		menuBarExample.add(editMenuExample);
		menuBarExample.add(closeMenuExample);
		menuBarExample.add(helpMenuExample);
		
		JMenuItem menuItemExampleOne = new JMenuItem("One");
		JMenuItem menuItemExampleTwo = new JMenuItem("Two");
		JMenuItem menuItemExampleThree = new JMenuItem("Three");
		JMenuItem menuItemExampleFour = new JMenuItem("Four");
		JMenuItem menuItemExampleFive = new JMenuItem("Five");
		
		openMenuExample.add(menuItemExampleOne);
		openMenuExample.add(menuItemExampleTwo);
		openMenuExample.add(menuItemExampleThree);
		openMenuExample.add(menuItemExampleFour);
		openMenuExample.add(menuItemExampleFive);

		menuItemExampleOne.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==menuItemExampleOne) {
                	System.out.println("First option!");
                }
                	
            }
        });
		
		menuItemExampleTwo.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==menuItemExampleTwo) {
                	System.out.println("Second option!");
                }
                	
            }
        });
		
		menuItemExampleThree.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==menuItemExampleThree) {
                	System.out.println("Third option!");
                }
                	
            }
        });
		
		menuItemExampleFour.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==menuItemExampleFour) {
                	System.out.println("Fourth option!");
                }
                	
            }
        });
		
		menuItemExampleFive.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==menuItemExampleFive) {
                	System.out.println("Fifth option!");
                }
                	
            }
        });
		frameExample.setVisible(true);
				
	}

}
