package d250109;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
	
	public static int minArr(int[] arr) {
		
		int min = arr[0];
		
		for (int value : arr ) {
			if (min > value) {
				min = value;
			}
		}
		return min;
		
	}
	
	static void swapArr (int[] arr) {
		int min_index = 0;
		int max_index = 0;
		int temp = 0;
		
		for (int i = 0; i<arr.length;i++) {
			
			if (arr[min_index] > arr[i]) {
				min_index = i;
				
			} 
			if (arr[max_index]  < arr[i]) {
				max_index = i;
			}
		}
		
		temp = arr[min_index];
		arr[min_index] = arr[max_index];
		arr[max_index] = temp;
	}
	
	
	public static void main(String[] args) {
		// 1. 배열에서 가장 작은 값 찾아서 리턴 하는 메소드
		
		// 2. 배열에서 가장 큰 값과 작은값의 위치를 바꿔주는 메소드
		
		int arr[] = {7,5,4,6,3,4,6};
		
		int min = minArr(arr);
		System.out.println(min);

		
		System.out.println(Arrays.toString(arr));
		swapArr(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	
}
