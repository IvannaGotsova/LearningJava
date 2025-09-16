import java.awt.Dimension;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jframeExample = new JFrame();
		jframeExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframeExample.setSize(600, 600);
        jframeExample.setLayout(null);


		JProgressBar jProgressBarExample = new JProgressBar();
		jProgressBarExample.setValue(0);
		jProgressBarExample.setBounds(0, 0, 300, 50);
		jProgressBarExample.setStringPainted(true);
		jframeExample.add(jProgressBarExample);
		
		jframeExample.setVisible(true);
		
		startProgressingBar(jProgressBarExample);
	}

	private static void startProgressingBar(JProgressBar jProgressBarExample) {
		int counter = 0;
		
		while(counter <= 100) {
			jProgressBarExample.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter++;
		}
	}
}
