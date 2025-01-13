package d250108;

public class GoodCalc extends Calculator {
	
	@Override
	int mul (int x, int y) {
		 return x*y;
	}
	
	@Override
	int div (int x, int y) {
		 return x/y;
	}

	int mod(int x, int y) {
		// TODO Auto-generated method stub
		return x % y;
	}
}
