package d250102;

import java.util.Arrays;

public class test5 {
	public static void main(String[] args) {
		
		int arr[] = {3,5,10,2,7} ;
		int temp = 0;
		
		for (int i=(arr.length-1);i>0;i--) {
			for (int j=0;j<i;j++)
			if (arr[j] > arr[j+1] ) {
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));

			
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
