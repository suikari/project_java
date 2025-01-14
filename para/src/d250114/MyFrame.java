package d250114;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {
	JButton b1,b2;
	JPanel p = new JPanel();
	public int[][] maze =  {
							{1,1,1,1,0,0,0,1,1,1},
			                {2,0,0,0,0,1,1,0,0,0},
			                {1,1,0,1,1,1,0,0,1,0},
			                {1,1,0,1,0,1,0,1,1,0},
			                {1,1,0,0,0,0,0,0,0,1},
			                {1,1,0,1,1,1,1,1,0,1},
			                {1,1,0,0,0,0,0,1,1,1},
			                {1,0,0,1,1,1,0,0,0,3}
						   };
	public JButton[][] jpArray;
	
	
	public void DrawBlocks() {		
		this.jpArray = new JButton[maze.length][maze[0].length];
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				jpArray[i][j] = new JButton(""+maze[i][j]);
				jpArray[i][j].setSize(100,100);
				jpArray[i][j].setLocation(j*100, i*100);
				
				if(maze[i][j] == 0) {
					jpArray[i][j].setBackground(Color.black);
				}else if (maze[i][j] == 2 || maze[i][j] == 3) {
					jpArray[i][j].setBackground(Color.yellow);
				} else {
					jpArray[i][j].setBackground(Color.white);
				}
				p.add(jpArray[i][j]);
			}
		
		}
		p.setLayout(null);
	    p.setSize(1000,1000);
		add(p);

	}
		
	public MyFrame() {
	  //super("프레임 연습");
	  setTitle("maze");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  DrawBlocks();
	  
		/*
		 * Container contentPane = getContentPane();
		 * contentPane.setBackground(Color.BLUE); contentPane.setLayout(new
		 * FlowLayout());
		 */
	  
	  b1 = new JButton("OK");
	  b2 = new JButton("Cancel");
	

		/*
		 * p.add(b1); p.add(b2); p.setLayout(new FlowLayout());
		 */
	  

	  
	  b1.addActionListener(this);//이벤트메소드호출
	  b2.addActionListener(this);//이벤트메소드호출


	  
	  setSize(1100,900);
	  setVisible(true);
	  
	  
	  
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			Random rnd = new Random();
			
			p.setBackground(Color.YELLOW);
			p.add(new JLabel(""+(rnd.nextInt(65)+1)));
			p.revalidate();
			//System.out.println("color");
			
		}else if(e.getSource()==b2) {
			p.setBackground(Color.pink);
		}
	}


	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
  
}
