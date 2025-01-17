package test2;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		int index = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);

		int[] sum = new int[6];
		
		for (int i=0;i<sum.length;i++) {
			
			while (true) {
				
				
				System.out.print(i+"번 배열에 입력할 숫자를 입력하세요 : ");
				
				num = sc.nextInt();
				
				if ( num > 0 && num <= 100 && !( num % 5 == 0) ) {
					sum[i] = num;
					break;
				} else {
					System.out.println("1~100의 숫자 중 5의 배수가 아닌 경우에만 입력가능합니다.");
				}
				
			}
						
		}
		
		System.out.print("입력된 값은 : " + Arrays.toString(sum));
	}
}
