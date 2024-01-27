import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Please, write your name");
		JOptionPane.showMessageDialog(null, "Your name is: " + name);
		
		
		int age =Integer.parseInt(JOptionPane.showInputDialog("Please, write your age")); 
		JOptionPane.showMessageDialog(null, "Your age is: " + age);
	}	

}
