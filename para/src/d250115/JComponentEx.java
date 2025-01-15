package d250115;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JComponentEx extends JFrame {

	public JComponentEx() {
		// TODO Auto-generated constructor stub
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setFocusable(true);
		 c.requestFocus();
		 c.setLayout(new FlowLayout());
		 
		 JButton btn1 = new JButton("색상");
		 JButton btn2 = new JButton("비활성");
		 JButton btn3 = new JButton("활성화");
		 
		 JTextArea txt1 = new JTextArea();
		 
		 btn1.setBackground(Color.cyan);
		 btn1.setForeground(Color.gray);
		 btn1.setFont(new Font("궁서",Font.BOLD, 30));

		 btn2.setEnabled(false);
		 
		 btn2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 JButton b = (JButton)e.getSource();
				 btn2.setEnabled(false);
				 //JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
				 
				 //frame.setTitle(b.getX() + "," + b.getY()); // 
			 }
		 });	
		 
		 btn3.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent e) {
					 JButton b = (JButton)e.getSource();
						 btn2.setEnabled(!btn2.isEnabled());
						 btn1.setVisible(false);
					 
					 //JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
					 
					 //frame.setTitle(b.getX() + "," + b.getY()); // 
				 }
		 });		 
		 
		 
		 c.add(btn1);
		 c.add(btn2);
		 c.add(btn3);
		 c.add(txt1);
		 setSize(300,200);
		 setVisible(true);			 
	}

	public static void main(String[] args) {
		new JComponentEx();
	}
}
