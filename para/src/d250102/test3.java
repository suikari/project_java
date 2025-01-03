package d250102;

import java.util.Arrays;
import java.util.Random;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[] = new int[6];
		int count = 0;
		boolean flag = true;
		
		for(int i=0 ; i<arr.length; i++) {
			
			flag = true;
			
			int ranNum = ran.nextInt(45)+1;
			
			for (int j=0; j<i; j++ ) {
				if (ranNum == arr[j]) {
					System.out.println("중복 숫자 있음.");
					i--; 
					count++;
					flag = false;
					break;
				}
			}
			
			if (flag) { arr[i] = ranNum; }
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("중복횟수는 " + count + "회 입니다.");

	}

}
