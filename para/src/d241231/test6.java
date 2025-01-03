package d241231;

import java.util.Arrays;
import java.util.Scanner;

public class test6 {
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int input = 0;
	   int arr[] = new int[5];
	   for (int i = 0 ; i < arr.length; i++) {
		 input = scan.nextInt(); 
		 while ( input <= 0 ) {
			System.out.println("0이상의 정수로 다시 입력해주세요.");
			 input = scan.nextInt(); 
		 }
		  
		 arr[i] = input;
	   }
	   
	   System.out.println(Arrays.toString(arr));
   }
}
