package d250116;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CheckBoxEvent extends JFrame {
	 JLabel tot = new JLabel("현재 0원 입니다." , SwingConstants.CENTER);

	
	public CheckBoxEvent() {
		// TODO Auto-generated constructor stub
		 setTitle("체크박스");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setFocusable(true);
		 c.setLayout(new FlowLayout());
		 
		 JLabel label = new JLabel(" 사과 100원, 배 500원, 체리 20000원 " , SwingConstants.CENTER);
		
		 		 
		 String names[] = {"사과", "배", "체리"};
		 
		 
		 c.add(label);
		 MyItemListener listener = new MyItemListener();

		 for (int i=0; i<names.length;i++) {
			 JCheckBox fruit = new JCheckBox(names[i]);
			 fruit.setBorderPainted(true);
			 fruit.addItemListener(listener);
			 
			 c.add(fruit);
		 }
		 
		 c.add(tot);


		 


		 c.requestFocus();
		 setSize(250,200);
		 setVisible(true);
	}
		
	 class MyItemListener implements ItemListener{
			int sum = 0;					
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox fruit = (JCheckBox) e.getItem();

				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) {
					
					if (fruit.getText().equals("사과")) {
						sum += 100;
					}
					
					if (fruit.getText().equals("배")) {
						sum += 500;
					}						
					
					if (fruit.getText().equals("체리")) {
						sum += 20000;
					}						
				} else {
					
					if (fruit.getText().equals("사과")) {
						sum -= 100;
					}
					
					if (fruit.getText().equals("배")) {
						sum -= 500;
					}						
					
					if (fruit.getText().equals("체리")) {
						sum -= 20000;
					}				
				}
				tot.setText("현재"+sum+"원 입니다.");
			 }
	 }
	 
	public static void main(String[] args) {
		new CheckBoxEvent();
		
	}
}
