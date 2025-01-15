package d250115;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BtnEvent1 extends JFrame implements ActionListener {

	public BtnEvent1() {
		// super("프레임 연습");
		setTitle("test");
		JPanel p = new JPanel();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rnd = new Random();
		
		  Container contentPane = getContentPane();
		  //contentPane.setBackground(Color.BLUE); contentPane.setLayout(new FlowLayout());

		  JButton b1 = new JButton("액션"); 
		  JButton b2 = new JButton("Action");
		  
		  b1.addActionListener(this);//이벤트메소드호출 
		  b2.addActionListener(this);//이벤트메소드호출
		  
		  
		  
		  p.add(b1);
		  p.add(b2); 
		  p.setLayout(new FlowLayout());
		add(p);

		setSize(800, 800);
		setVisible(true);

	}
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JButton b = (JButton)e.getSource();
		 if(b.getText().equals("Action"))
		 b.setText("액션");
		 else
		 b.setText("Action");
		 // InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
		 BtnEvent1.this.setTitle(b.getText()); // 프레임 타이틀에 버튼문자열을출력한다.
	}
	
	public static void main(String[] args) {
		BtnEvent1 frame = new BtnEvent1();
	}
	

	
	
	
}
