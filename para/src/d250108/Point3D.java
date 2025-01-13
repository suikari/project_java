package d250108;

public class Point3D extends Point {

		int z = 0 ;
	


	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}

	@Override
	//(1,2,3) 의 점
	public String toString() {
		return "(" + getX() + "," + getY() + "," + this.z + ") 의 점" ;
	}
	
	
	private void move(int x, int y, int z) {
		// TODO Auto-generated method stub
		super.move(x, y);
		this.z = z;
	}

	private void moveDown() {
		// TODO Auto-generated method stub
		this.z--;
	}

	private void moveUp() {
		// TODO Auto-generated method stub
		this.z++;
	}

	
	public static void main(String[] args) {
		   Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		   System.out.println(p.toString()+"입니다.");
		   p.moveUp(); // z 축으로 위쪽 이동
		   System.out.println(p.toString()+"입니다.");
		   p.moveDown(); // z 축으로 아래쪽 이동
		   p.move(10, 10); // x, y 축으로 이동
		   System.out.println(p.toString()+"입니다.");
		   p.move(100,  200, 300); // x, y, z축으로 이동
		   System.out.println(p.toString()+"입니다.");
	}
}
