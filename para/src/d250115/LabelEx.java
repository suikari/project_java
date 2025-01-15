package d250115;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		// TODO Auto-generated constructor stub
		
		
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());
		 
		 JLabel tel1 = new JLabel("자바 재밌나?");
		 
		 ImageIcon image1 = new ImageIcon("image/pngegg.png");
		
		 Image image = image1.getImage();
		 Image scaledImage = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		 ImageIcon scaledIcon = new ImageIcon(scaledImage);
	        
		 ImageIcon phone1 = new ImageIcon("image/tel.png");
		 
		 Image image2 = phone1.getImage();
		 Image scaledImage2 = image2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		 ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
		 
		 JLabel label3 =  new JLabel("자바 싫어!",scaledIcon2, SwingConstants.CENTER);
		 
		 
		 JLabel iu = new JLabel(scaledIcon);
		 
		 
		 
		 c.add(tel1);
		 c.add(iu);
		 c.add(label3);
		 
		 c.setFocusable(true);
		 c.requestFocus();
		 setSize(500,500);
		 setVisible(true);
		 
	}
	
	public static void main(String[] args) {
		new LabelEx();
		
	}

}
