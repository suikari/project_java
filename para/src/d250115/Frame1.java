package d250115;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame1 extends JFrame implements ActionListener {
	int count = 1;
	JLabel label = new JLabel("clear!");
	SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
	
	double stime;
	double etime;
	
	
	public Frame1() {
		// super("프레임 연습");
		setTitle("test");
		JPanel p = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rnd = new Random();
		
		  Container contentPane = getContentPane();
		  //contentPane.setBackground(Color.BLUE); contentPane.setLayout(new FlowLayout());
		  
		  
		  for (int i=1;i<11;i++) {
			  JButton b1 = new JButton(i+"");  
			  b1.setLocation(rnd.nextInt(400), rnd.nextInt(400));
			  b1.setSize(75,75);
			  b1.addActionListener(this);
			  p.add(b1);
		  }
		  

		  label.setSize(50,50);
		  label.setLocation(250,250);
		  p.add(label);
		  label.setVisible(false);

		  p.setLayout(null);
		  add(p);
		  //JButton b1 = new JButton("OK"); 
		  //JButton b2 = new JButton("Cancel");
		  
		  //b1.addActionListener(this);//이벤트메소드호출 b2.addActionListener(this);//이벤트메소드호출
		  
		  
		  
		  //p.add(b1);
		  //p.add(b2); 
		  //p.setLayout(new FlowLayout());
		 

		setSize(500, 500);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		Frame1 frame = new Frame1();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton) e.getSource();
		if (  Integer.parseInt(btn.getText())   == count) {
			btn.setVisible(false);
			//System.out.print("1");
			count++;
		}
		
		if (count == 2) {
	      stime = System.currentTimeMillis();
		} else if (count == 11) {
			label.setVisible(true);
			etime = System.currentTimeMillis();
			double time = ( (etime-stime) / 1000 );
			System.out.print(time);
			
			revalidate();

		}
		// TODO Auto-generated method stub

	}
}
