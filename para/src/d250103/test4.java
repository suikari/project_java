package d250103;

import java.util.Arrays;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,-4,-10,8,-15,6,2};
		//Arrays.sort(arr);
		int temp = 0;
		int minindex = 0;
		
	    for (int i=0;i<arr.length-1;i++) {
	    	
	    	minindex = i;
	    	
	    	for (int j =0+i;j<arr.length;j++) {
	    		
	    		/*if (Math.abs(arr[minindex]) > Math.abs(arr[j]) ) {
	    			minindex = j;
	    		}*/
	    		
	    		/*if (arr[minindex] > 0 && arr[j] > 0 ) {
	    			if (arr[minindex] > arr[j]) {
		    			minindex = j;
		    		}
	    		} else if (arr[minindex] > 0 && !(arr[j] > 0)) {
	    			if (arr[minindex]  > (arr[j]*-1) ) {
	 	    			minindex = j;
	 	    		} 
	    		} else if (!(arr[minindex] > 0) && arr[j] > 0) {
	    		    if  ((arr[minindex]*-1)  > arr[j] ){
	    		    	minindex = j;
	    		    }
	    		} else {
	    		    if  ((arr[minindex]*-1)  > (arr[j]*-1) ){
	    		    	minindex = j;
	    		    }	    			
	    		}*/
	    		
	    		int orgNum = arr[j] > 0 ? arr[j] : -arr[j];
	    		int indexNum = arr[minindex] > 0 ? arr[minindex] : -arr[minindex];
	    		
	    		if (indexNum > orgNum) {
	    			minindex = j;
	    		}
	    		
	    	}
	    	
	    	temp = arr[i];
	    	arr[i] = arr[minindex];
	    	arr[minindex] = temp;
	    	
	    }
		
		
		System.out.println(Arrays.toString(arr));
	}

}
