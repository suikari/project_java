package d250116;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx1 extends JFrame {
    public TextFieldEx1() {
		// TODO Auto-generated constructor stub
		 setTitle("Click and DoubleClick 예제");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setFocusable(true);
		 c.setLayout(new FlowLayout());
		 
		 JLabel idlabel = new JLabel("아이디 : ");
		 JTextField idfield = new JTextField(20);

		 
		 JLabel pwdlabel = new JLabel("비밀번호 : ");
		 JPasswordField pwdfield = new JPasswordField(20);
		 
		 c.add(idlabel);
		 c.add(idfield);
		 
		 c.add(pwdlabel);
		 c.add(pwdfield);		 
		 
		 
		 c.requestFocus();
		 setSize(330,200);
		 setVisible(true);
    }
 
    public static void main(String[] args) {
    	new TextFieldEx1();
    	
	}
}
