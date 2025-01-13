package d250108;

public abstract class Calculator {
	
	int sum (int x, int y ) {
		return x+y;
	}
	
	int sub (int x, int y ) {
		return x-y;
	}
	
	abstract int mul (int x, int y );
	/*{
		return x*y;
	}*/
	
	abstract int div (int x, int y ) ;
	/*{
		return x/y;
	}*/
	
}
