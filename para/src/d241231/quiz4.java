package d241231;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz4 {
	public static void	main(String[] args) {
		// 0이나 음수가 입력되면 저장 x 다시입력받는다
		int arr[] = new int[6];
		int input = 0;
		int flg = 0;
		int count = 0;		
		int tmp = 0;
		
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length;i++) {
			
			do {
				flg = 0;
			    input = random.nextInt(45)+1; 
				System.out.println(input);

			    for (int j=0;j < arr.length;j++) {
			      if ( arr[j] == input) { flg = 1;  count++; }
			     			      
			    }
			    
			} while (flg != 0);
		    
		    arr[i] = input;

		    for (int j=0;j < arr.length;j++) {
		      if ( arr[j] > arr[i] ) { 
		    	  tmp = arr[j];
		    	  arr[j] = arr[i];
		    	  arr[i] = tmp;
		      } 
		    }
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("중복횟수는 "+ count + " 회 입니다.");
	}
}
