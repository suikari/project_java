package d250116;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame {
	
	public CheckBoxEx1() {
		// TODO Auto-generated constructor stub
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setFocusable(true);
		 c.setLayout(new FlowLayout());

		 ImageIcon normalIcon= new ImageIcon("image/normal.png");
		 ImageIcon rolloverIcon= new ImageIcon("image/toggle.png");

		 
		 JCheckBox cheek1 = new JCheckBox("사과");
		 JCheckBox cheek2 = new JCheckBox("배");
		 JCheckBox cheek3 = new JCheckBox(normalIcon);
		 
		 cheek3.setBorderPainted(true);
		 cheek3.setSelectedIcon(rolloverIcon);
		 
		 c.add(cheek1);
		 c.add(cheek2);
		 c.add(cheek3);
 
		 
		 c.requestFocus();
		 setSize(300,200);
		 setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxEx1();
	}
}
