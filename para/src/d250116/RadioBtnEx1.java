package d250116;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioBtnEx1 extends JFrame {
	
	public RadioBtnEx1() {
		// TODO Auto-generated constructor stub
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());

		 ButtonGroup gender = new ButtonGroup();
		 
		 JRadioButton radio1 = new JRadioButton("남");
		 JRadioButton radio2 = new JRadioButton("여");

		 gender.add(radio1);
		 gender.add(radio2);
				 
		 c.add(radio1);
		 c.add(radio2);
		 
		 
		 
		 c.setFocusable(true);
		 c.requestFocus();
		 setSize(300,200);
		 setVisible(true);		 
	}
	
	public static void main(String[] args) {
		new RadioBtnEx1();
	}
}
