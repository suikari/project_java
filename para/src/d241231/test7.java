package d241231;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test7 {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

		   
		   int val = 0;
		   
		   System.out.println("숫자를 몇개 저장하시겠습니까?");
		   val = sc.nextInt();
		  
		   
		   int arr[] = null;
		   
		   while ( val <= 0 ) {
					System.out.println("0이상의 정수로 다시 입력해주세요.");
					val = sc.nextInt(); 
		   }			 
		   
		   arr = new int[val];
		   
		   
		   for (int i=0; i< arr.length;i++) {
			   int input = sc.nextInt();
			   
			   while ( input <= 0 ) {
						System.out.println("0이상의 정수로 다시 입력해주세요.");
						input = sc.nextInt(); 
			   }		
			   
			   arr[i] = input;
		   }
		   
		   System.out.println(Arrays.toString(arr));
	   }
}
