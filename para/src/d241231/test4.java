package d241231;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
	public static void	main(String[] args) {
		// 0이나 음수가 입력되면 저장 x 다시입력받는다
		int arr[] = new int[5];
		int input = 0;
		String tr = "";
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length;i++) {
		    
			do {
			    System.out.println( (i+1) + "번째 값을 음수, 0보다 큰값으로 다시 입력해주세요 : ");
			    input = sc.nextInt();
		    } while (0 >= input );
		    
		    arr[i] = input;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
