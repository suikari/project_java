package d250116;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
	JTextField tf = new JTextField(10);
	Vector<String> v = new Vector<>();
	JList<String> nameList = new JList<>();
	
	
	public ListChangeEx() {
		// TODO Auto-generated constructor stub
	
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setFocusable(true);
		 c.setLayout(new FlowLayout());
		 
		 c.add(new JLabel("이름 입력 후 <Enter> 키"));
		 c.add(tf);
		 
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField namet = (JTextField)e.getSource();
				String name = namet.getText();
				System.out.print(name);
			}
			
		});
		 
		 c.add(nameList);
		 
		 
		 c.requestFocus();
		 setSize(300,200);
		 setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListChangeEx();
	}
}
