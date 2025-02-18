package test2;

public class test2 {

	public static void main(String[] args) {
		int even_num = 0;
		
		
		for (int i=1;i<=100;i++) {
			if ( i % 2 == 0  && i % 5 == 0) {
				even_num += i;
			}
		}
		
				
		System.out.println("1~100까지의 짝수이면서 5의 배수의 합은 " + even_num + " 입니다.");
	}

}
