package d250106;

public class CalcMain {
	public static void main(String[] args) {
		
		
		Math.abs(-10);
				
		Calculator calc = new Calculator();
		
		calc.intro();
		int sum = calc.sum(4,5);
		
		System.out.println(sum);
	}
}
