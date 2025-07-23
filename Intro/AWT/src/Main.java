import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frameExample = new Frame();
        frameExample.setSize(500, 500);
        frameExample.setLayout(new FlowLayout());

        Button buttonOne = new Button("YES");
        buttonOne.setBounds(0, 0, 50, 50);
        frameExample.add(buttonOne);

        Button buttonTwo = new Button("NO");
        buttonTwo.setBounds(100, 0, 50, 50);
        frameExample.add(buttonTwo);
       
        Button buttonThree = new Button("CANCEL");
        buttonThree.setBounds(150, 0, 80, 50);
        frameExample.add(buttonThree);

        frameExample.setVisible(true);
	}

}
