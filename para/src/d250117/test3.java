package d250117;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test3 {
	
	public static void main(String[] args) {
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개의 배열을 사용하시겠습니까? (숫자로 입력)");
		index = sc.nextInt();
		
		int[] sum = new int[index];

		
		for (int i=0;i<index;i++) {
			
			System.out.print(i+"번째 배열에 입력할 숫자를 입력하세요 : ");
			sum[i] = sc.nextInt() ;
			
		}
		
		
		
		System.out.print("입력된 값은 : " + Arrays.toString(sum));
		
		
	}
}
