package d250121;

public class GoodCalc implements Calculator {

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int x, int y, int z) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mal(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static int max( int x, int y ) {
		
		int maxnum = 0;
		try {
			if (x>y) {
				 maxnum = x;
			} else {
				maxnum = y;
			}
		} catch (Exception e) {
			
		}
		
		return maxnum;
	}
	
	public static void main(String[] args) {
		int max = max(64,43);
		
		
	}
}
