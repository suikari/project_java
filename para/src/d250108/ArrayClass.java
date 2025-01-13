package d250108;

public class ArrayClass {

	static int maxValue(int[] array) {
		
		int max = 0;
		
		max = array[0];
		
		for(int value : array) {
			if (max < value ) {
				max = value;
			}
		}
		
		return max;
		
	}
	
	static int maxIndex(int[] array) {
		
		int max_index = 0;
		
		
		for(int i=0;i<array.length;i++) {
			if (array[max_index] < array[i] ) {
				max_index = i;
			}
		}

		return max_index;	
	}
}
