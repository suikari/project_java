package d250116;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JtextAreaEx extends JFrame {
	
	JTextField input = new JTextField(20);
	
	JTextArea save = new JTextArea(7,20);
	
	public JtextAreaEx() {
		// TODO Auto-generated constructor stub
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 
		 c.setFocusable(true);
		 c.setLayout(new FlowLayout());
		 
		 input.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField  name = (JTextField) e.getSource();
				save.append(name.getText()+"\n");
				name.setText("");
			}
		 
		 });
		 
		 save.setEditable(false);

		 c.add(input);
		 c.add(save);
		 c.add(new JScrollPane(save));
		 
		 c.requestFocus();
		 setSize(300,200);
		 setVisible(true);	
	}
	
	public static void main(String[] args) {
		
		new JtextAreaEx();
	}
}
