import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue", JOptionPane.YES_NO_CANCEL_OPTION);
		String answer = JOptionPane.showInputDialog("Do you want to continue?");
		
		System.out.println(answer);
	}

}
