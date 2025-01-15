package d250115;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame {
	JLabel label;
	
	public MouseEvent1() {
		setTitle("마우스 이벤트");
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseListener() {
				 public void mousePressed(MouseEvent e) {
					 int x = e.getX();
					 int y = e.getY();
					 label.setLocation(x, y);
					 }
				 	public void mouseReleased(MouseEvent e) {}
					@Override
					public void mouseClicked(MouseEvent e) {}
					@Override
					public void mouseEntered(MouseEvent e) {}
					@Override
					public void mouseExited(MouseEvent e) {}					 
		});

		label = new JLabel("Hello"); 

		
		label.setSize(50,20);
		label.setLocation(30, 30);
		c.add(label);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		

	}
	
	class MyMouseAdapter extends MouseAdapter {
		 public void mousePressed(MouseEvent e) {
		 int x = e.getX();
		 int y = e.getY();
		 label.setLocation(x, y);
		 }
	}
	
	public static void main(String[] args) {
		
		MouseEvent1 content = new MouseEvent1();
		
	}
	
}
