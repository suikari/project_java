package d250108;

public class ColorPoint extends Point {
	String color;
		
	public ColorPoint(int x, int y , String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "";
		// TODO Auto-generated constructor stub
	}
	
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
		// TODO Auto-generated constructor stub
	}	
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
		   
		   
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp1 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp1.setXY(5,5);
		cp1.setColor("RED");
		System.out.println(cp1.toString()+"입니다.");
		   
	}



	@Override
	//RED색의 (10,20)의 점입니다. 
	public String toString() {
		
		return  color + "색의 (" + getX() + "," + getY() + ")의 점입니다.";
		
	}



	private void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}



	private void setXY(int x, int y) {
		// TODO Auto-generated method stub
		move(x,y);
	}
	
}
