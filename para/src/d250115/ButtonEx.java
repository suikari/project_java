package d250115;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		
		setTitle("이미지버튼예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon= new ImageIcon("image/normal.png");
		ImageIcon rolloverIcon= new ImageIcon("image/toggle.png");
		ImageIcon pressedIcon= new ImageIcon("image/push.png");
		
		JButton btn= new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String [] args) {
		new ButtonEx();
	}
}