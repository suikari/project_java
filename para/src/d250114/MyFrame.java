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
import javax.swing.JOptionPane;
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
		p.removeAll();
		p.revalidate();

		this.jpArray = new JButton[maze.length][maze[0].length];
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				jpArray[i][j] = new JButton(""+maze[i][j]);
				jpArray[i][j].setSize(100,100);
				jpArray[i][j].setLocation(j*100, i*100);
				jpArray[i][j].addActionListener(this);//이벤트메소드호출

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
	
	public void SetBlocks(int x, int y) {
		
		if ( maze[x][y] == 0 ) {
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					
					
						 if ( x <= i+1 && x >= i-1  ) {  
							 if ( y <= j+1 && y >= j-1  ) {  
								 if ( maze[i][j] == 2 ) {
									 maze[i][j] = 0;
									 maze[x][y] = 2;
								 }
							 }
						 }					
					
				}
			}
			
			DrawBlocks();
		}  else if (maze[x][y] == 3) {
			 JOptionPane.showMessageDialog(null, "도착!");
		}
		
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
	  
	  /* b1 = new JButton("OK");
	  b2 = new JButton("Cancel");

	  b1.addActionListener(this);//이벤트메소드호출
	  b2.addActionListener(this);//이벤트메소드호출


	
	 * p.add(b1); p.add(b2); p.setLayout(new FlowLayout());
	 */
	  

	  

	  
	  setSize(1100,900);
	  setVisible(true);
	  
	  
	  
	}


	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		//btn.get
		
//		for (int i = 0; i < maze.length; i++) {
//			for (int j = 0; j < maze[0].length; j++) {
//				if(e.getSource()==jpArray[i][j]) {
//					SetBlocks(i,j);
//					//System.out.println(i+","+j);
//				}
//			}
//		}
	}


	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
  
}
