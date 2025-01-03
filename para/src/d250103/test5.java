package d250103;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {
	
	public static void main(String[] args) {
		int arr[][] = new int[4][2]; //{{3,3}, {3,3}};
		
		int input = 0 ;
		
		Scanner sc = new Scanner(System.in);

		/*
			{10,20},
			{30,40},
			{5,3},
			{9,100}
		*/
		
		for (int i = 0 ;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				System.out.print(i+","+j+"번째 수 입력 : ");
			    input = sc.nextInt();
			    arr[i][j] = input;
			}
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
}
