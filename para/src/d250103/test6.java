package d250103;

import java.util.Arrays;
import java.util.Random;

public class test6 {
	
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int count = 0 ;
		int sum   = 0 ;
		Random rn = new Random();
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = rn.nextInt(20)+1;
				sum += arr[i][j];
				count++;
			}
			
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}	
		System.out.println((double)sum/count);
		
	}
}
