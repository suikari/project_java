package d241231;

import java.util.Arrays;

public class test5 {
	   public static void main(String[] args) {
		   int arr[] =  {3,7,4,9,6};
		   int max_index =  0 ; 
		   int min_index =  0 ; 
		   int tmp = 0;
		   
		   for (int i = 1; i<arr.length; i++ ) { 
			   if ( arr[max_index] < arr[i] ) {  max_index = i; }
			   if ( arr[min_index] > arr[i] ) {  min_index = i; }
		   }
		 
		   System.out.println("가장큰 수의 배열번호 : " + max_index );
		   System.out.println("가장큰 수 : " + arr[max_index] );
		   
		   
		   System.out.println("가장작은 수의 배열번호 : " + min_index );
		   System.out.println("가장작은 수 : " + arr[min_index] );
		   
		   System.out.println("바꾸기 전" + Arrays.toString(arr));

		   tmp = arr[max_index];
		   arr[max_index] = arr[min_index];
		   arr[min_index] = tmp;
		  
		   System.out.println("바꾼 후 " + Arrays.toString(arr));

		   
		   System.out.println( 1.1 + 0.1 == 1.2);
		   System.out.println( 1.2 == 1.2);

	   } 
}
