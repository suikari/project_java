package d250103;

public class Calculartor {
	
	void sum(int x, int y) {
		System.out.println("두 수의 합은 " + (x+y));
	}

	void sub(int x, int y) {
		System.out.println("두 수의 차는 " + (x-y));
	}
		
	
	double mul (int x, double y) {
		
		return x * y;
	}			
	
	
	int mul(int x, int y) {
		//System.out.println("세 수의 곱은 " + (x*y*z));
		
		return x * y;
	}	
	int mul(int x, int y , int z) {
		//System.out.println("세 수의 곱은 " + (x*y*z));
		
		return x * y * z;
	}
	
	void dec(int x, int y) {
		System.out.println("두 수의 나눗셈은 " + (x/y));
	}
	
	int swap(int x, int y) {
		int temp = 0 ;
			
		temp = x;
		x = y;
		y = temp;
		
		return x+y;
	}
}
