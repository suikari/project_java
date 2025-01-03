package d250103;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculartor cal = new Calculartor();
		
		
		cal.sum(2, 3);
		cal.sub(2, 3);
		cal.mul(2, 3);
		cal.dec(2, 3);
		
		int dex = 5;
		int lux = 8;
		
		cal.swap(dex, lux);
		System.out.println(lux);
		
	    int mul_1= cal.mul(3, 4, 7);
	    
	    System.out.println(mul_1);

	}

}
