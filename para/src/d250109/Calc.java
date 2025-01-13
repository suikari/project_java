package d250109;

public class Calc {

	public static int sum (int x , int y) {
		return x+y;
	}
	
	public static int multiple (int x , int y) {
		return x*y;
	}
	public static int multiple (int x , int y, int z) {
		return x*y*z;
	}	
	public static int multiple (int x , int y, int z, int t) {
		return x*y*z*t;
	}
	
	
	public static void main(String[] args) {
		System.out.println(sum(4,3));
		
		System.out.println(multiple(4,3));

		System.out.println(multiple(4,3,4));
		
		System.out.println(multiple(4,3,4,5));
	
		
	}
}
