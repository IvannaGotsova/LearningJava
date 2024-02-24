import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame jframeExample = new JFrame();
		jframeExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframeExample.setSize(600, 600);
        
        JPanel jpanelExample = new JPanel();
		jframeExample.add(jpanelExample);
        
		JLabel jlabelExample = new JLabel();
		jpanelExample.add(jlabelExample);


		JSlider jsliderExample = new JSlider(0, 10, 5); 
		jsliderExample.setPreferredSize(new Dimension(500, 500));
		jsliderExample.setPaintTrack(true);
		jsliderExample.setMajorTickSpacing(1);
		jsliderExample.setPaintLabels(true);
		jsliderExample.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider jSlider = (JSlider) e.getSource();
                int sliderValue = jSlider.getValue();
                System.out.println("Current number is " + jsliderExample.getValue());             
            }
        });
	
		jpanelExample.add(jsliderExample);
		
		
		jframeExample.pack();
		jframeExample.setVisible(true);
		
	}
}


