package d250102;

import java.util.Arrays;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,5,10,2,7} ;
		int temp = 0;
		int min = 0;
		int min_index = 0;
		
		for (int i=0;i<arr.length;i++) {
			if (i==0) { min = arr[i]; }
			
			
		    for (int j=i;j < arr.length;j++) {
			      if ( min > arr[j] ) { 
			    	  min = arr[j];
			    	  min_index = j;
			      } 
			}
		    
		    temp = arr[i];
		    arr[i] = arr[min_index];
		    arr[min_index] = temp;
			System.out.println(Arrays.toString(arr));

		}
		
		//System.out.println(min_index);
		
		System.out.println();
		System.out.println(Arrays.toString(arr));

	}

}
