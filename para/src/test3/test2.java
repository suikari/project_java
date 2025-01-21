package test3;

public class test2 {

	public static void main(String[] args) {
		
		for (int i=1;i<=100;i++) {
			
			if ( (i % 2 == 1 || i % 8 == 0) && !(i > 49 && i < 61) ) {
				System.out.println(i);
			}
 			
		}
		
	}
		
}
	
//2. 1부터 100까지 숫자 중 홀수이거나 8의 배수인 숫자를 출력하시오.
//단, 50~60까지의 숫자를 출력하지 마시오.