import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		JLabel labelExample = new JLabel();
		labelExample.setText("TEXT EXAMPLE");

		JFrame jframeExample = new JFrame();
		jframeExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeExample.setBounds(250, 250, 250, 250);
		
		jframeExample.setVisible(true);
		jframeExample.add(labelExample);
	}

}
