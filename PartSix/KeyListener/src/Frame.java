import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements KeyListener{

	JLabel labelExample;
	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.addKeyListener(this);
		
		labelExample = new JLabel();
		labelExample.setBackground(Color.yellow);
		labelExample.setBounds(0, 0, 100, 100);
		labelExample.setOpaque(true);
		labelExample.setText("EXAMPLE");
		this.add(labelExample);
		
	

		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 'a') {
			labelExample.setLocation(labelExample.getX()-1, labelExample.getY());
		} else if(e.getKeyChar() == 'b') {
			labelExample.setLocation(labelExample.getX(), labelExample.getY()-1);
		} else if(e.getKeyChar() == 'c') {
			labelExample.setLocation(labelExample.getX(), labelExample.getY()+1);
		} else if(e.getKeyChar() == 'd') {
			labelExample.setLocation(labelExample.getX()+1, labelExample.getY());
		} 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 37) {
			labelExample.setLocation(labelExample.getX()-1, labelExample.getY());
		} else if(e.getKeyCode() == 38) {
			labelExample.setLocation(labelExample.getX(), labelExample.getY()-1);
		} else if(e.getKeyCode() == 40) {
			labelExample.setLocation(labelExample.getX(), labelExample.getY()+1);
		} else if(e.getKeyCode() == 39) {
			labelExample.setLocation(labelExample.getX()+1, labelExample.getY());
		} 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
