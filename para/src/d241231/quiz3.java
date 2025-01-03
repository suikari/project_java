package d241231;

import java.util.Arrays;
import java.util.Scanner;

public class quiz3 {
	public static void	main(String[] args) {
		
		int arr[] = new int[5];
		String tr = "";
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length;i++) {
		    System.out.println(i + "번째 값 입력 : ");
			arr[i] = sc.nextInt();
			
			if ( i == 4) {
				tr +=  arr[i] ; 
			} else {
				tr +=  arr[i] + " , " ; 
			}	
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println("[" + tr + "]" );
		
		
	}
}
