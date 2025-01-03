package d250102;

import java.util.Arrays;

public class quiz2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,8,3,23,11};
		//배열 가장 작은수 인덱스 0번째랑 값 변경
		int min_index = 0;
		int temp = 0;
		
		for (int i=0;i<arr.length;i++) {	
			min_index = i;

			for (int j=i;j<arr.length;j++) {
				
				if (arr[j] < arr[min_index]) {
					min_index =  j ;
				}
				
			}
			
			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			
			System.out.println(i+","+min_index + ";" + temp );
			System.out.println(Arrays.toString(arr));

		}
		

		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
