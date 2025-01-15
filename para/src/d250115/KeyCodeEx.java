package d250115;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyCodeEx extends JFrame {
	
	public KeyCodeEx() {
		// TODO Auto-generated constructor stub
		
		setTitle("키보드 이벤트");
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyChar() == '%' ) {
					c.setBackground(Color.red);
				} else if (e.getKeyCode() == KeyEvent.VK_F1 ) {
					c.setBackground(Color.blue);
				} else {
					c.setBackground(Color.gray);
				}
			}
		});
				
		c.setFocusable(true);
		c.requestFocus();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		KeyCodeEx keycode = new KeyCodeEx();
		
	}
}
