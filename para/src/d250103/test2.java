package d250103;

import java.util.Arrays;

public class test2 {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 5, 2, 1, 4, -1, 7, -3, -4};
		// {3,5,2,1,4,7}
		int sum = 0;
		int count = 0;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		
		int[] arr2 = new int[count];
		
		for (int i=0;i<arr2.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if (arr[j] > 0) {
					arr2[i] = arr[j];
					arr[j] = 0;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr2));
	}
	
}
