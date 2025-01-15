package d250115;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	
	public MouseListenerAllEx() {
		// TODO Auto-generated constructor stub
		setTitle("상,하,좌,우키를이용하여텍스트움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("마우스 이벤트 전");
		c.add(label);
		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("드래그하는 중 " + e.getX() + "," + e.getY());
			}
			/*@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//label.setText("클릭되었음" + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//label.setText("클릭되었음! " + e.getX() + "," + e.getY());
			}*/
			
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("클릭땠음" + e.getX() + "," + e.getY());
			}

			
		});
		c.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("드래그하는 중 " + e.getX() + "," + e.getY());
			}
			/*@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//label.setText("클릭되었음" + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//label.setText("클릭되었음! " + e.getX() + "," + e.getY());
			}*/

			
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
		
	}
}
