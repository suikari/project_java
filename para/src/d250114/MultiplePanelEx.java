package d250114;

import java.awt.*;
import javax.swing.*;


public class MultiplePanelEx extends JFrame {
	
	public MultiplePanelEx() {
		super("Multiple Panels and Layouts"); // 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 프레임으로부터컨텐트팬알아내기
		c.setLayout(new BorderLayout()); // 컨텐트팬의배치관리자BorderLayout
		// 컨텐트팬에2개의패널(컨테이너) 부착
		c.add(new NorthPanel(), BorderLayout.NORTH); // NORTH 영역에NorthPanel 패널부착
		c.add(new CenterPanel(), BorderLayout.CENTER); // CENTER 영역에CenterPanel 패널부착
		setSize(300,300);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel { // 컨텐트팬의NORTH 영역패널
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY); // 배경색설정
			setLayout(new FlowLayout()); // FlowLayout 배치관리자지정
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}
	
	class CenterPanel extends JPanel { // 컨텐트팬의CENTER 영역패널
	private JLabel [] labels = {new JLabel("Hello"), new JLabel("Java"), new JLabel("Love")}; // 3개의JLabel을가진배열
		public CenterPanel() {
		setLayout(null); // 배치관리자삭제, 절대위치에컴포넌트삽입
			for(int i=0; i<labels.length; i++) {
				int x = (int)(Math.random()*200); // 0에서200미만의랜덤정수
				int y = (int)(Math.random()*200); // 0에서200미만의랜덤정수
				labels[i].setLocation(x, y); // 랜덤한위치에JLabel 배치
				labels[i].setSize(100,20); // JLabel의크기지정
				add(labels[i]); // JLabel을이패널(CenterPanel)에부착
			}
		}
	}
	
	static public void main(String[] arg) {
		new MultiplePanelEx();
	}
}