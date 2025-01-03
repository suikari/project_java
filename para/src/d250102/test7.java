package d250102;

import java.util.Arrays;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,10,2,7} ;
		int temp = 0;
		int min = 0;
		int min_index = 0;
		
		for (int i=0; i <arr.length ; i++) {
			if (i==0) { min = arr[i]; }

			for (int j = i+1 ; j < arr.length ; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j ; 					
				}
			}
			
			temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));

		}		
		System.out.println();
		System.out.println(Arrays.toString(arr));

	}

}
