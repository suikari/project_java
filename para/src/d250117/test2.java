package d250117;

public class test2 {
	
	public static void main(String[] args) {
		int even_num = 0;
		int odd_num = 0;
		
		
		for (int i=1;i<=100;i++) {
			if ( i % 2 == 1 ) {
				odd_num += i;
			} else {
				even_num += i;
			}
		}
		
		
		
		System.out.println("1~100까지의 짝수의 합은 " + even_num + " 입니다.");
		System.out.println("1~100까지의 홀수의 합은 " + odd_num + " 입니다.");
	}
}
