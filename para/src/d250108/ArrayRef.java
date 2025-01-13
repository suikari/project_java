package d250108;

public class ArrayRef {
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,2,4};
		
		//int arr2[] = arr;
		//arr2[3] = 100;
		
		//System.out.println(arr[3]);
		
		int max = ArrayClass.maxValue(arr);
		int max_index = ArrayClass.maxIndex(arr);

		System.out.println(max);
		System.out.println(max_index);

	}
}
