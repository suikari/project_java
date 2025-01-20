package d250120;

import java.util.Arrays;

import oracle.sql.ARRAY;

public class Review_Array2 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,3,4,7,5,4,3,2,3,4,1,5};

		for ( int i = 0;i<arr.length-1;i++) {
		
			int min = i;
		
			for ( int j = i+1 ; j<arr.length;j++ ) {
			
				if (arr[min] > arr[j] ) {
					min = j;
				}
				
			}
			
			int temp = 0;
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			System.out.println(Arrays.toString(arr));

		}
		
		
		
	}
}
