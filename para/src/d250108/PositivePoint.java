package d250108;

public class PositivePoint extends Point {

	public PositivePoint(int x, int y) {
		super(0, 0);
		this.move(x, y);

//		if (x < 0 || y < 1) {
//			super.move(0, 0);
//		}
		//if (x > 0 && y > 1) {super(x, y);}

	}

	public PositivePoint() {
		super(0, 0);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void move (int x,int y) {
		if (x > 0 && y > 1) {
			super.move(x, y);
		}
	}
	
	@Override
	//(1,2,3) 의 점
	public String toString() {
		return "(" + getX() + "," + getY() + ") 의 점" ;
	}	
	
	public static void main(String[] args) {
		   PositivePoint p = new PositivePoint();
		   p.move(10, 10);
		   System.out.println(p.toString()+"입니다.");
		   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
		   System.out.println(p.toString()+"입니다.");
		   PositivePoint p2 = new PositivePoint(-10, -10);
		   System.out.println(p2.toString()+"입니다.");
	}
	
}
