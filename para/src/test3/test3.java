package test3;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] val = new int[6];
		int index = 0;
		
		while (true) {
			
			System.out.print(index+"번째배열에 넣을 숫자를 입력하세요 :");
			int num = sc.nextInt();
			boolean flg = true;
			
			if ( num > 0 && num < 101) {
				for (int j=0;j<val.length;j++) {
					if (val[j] == num ) { 
						flg = false; 
						break;
					}
				}
				
				if (flg) {
					val[index] = num;
					index++;
					
				} else {
					System.out.println("1~100사이의 숫자가 아니거나, 겹치는 숫자를 넣으셨습니다. 다시입력바랍니다.");
				}
			}
			
			if (index==val.length) { break; }
			
		}
		
		int[] new_val = new int[index];
		
		for (int i=0;i<new_val.length-1;i++) {
					
			int min_index = i;
			
			for(int j=i+1;j<new_val.length;j++) {
				if (val[min_index] > val[j] ) {
					min_index = j;
				}
			}
			
			int temp = val[min_index];
			val[min_index] = val[i];
			val[i] = temp;
			new_val[i] = temp;
			
			if (i == val.length-2) { new_val[i+1] = val[i+1];}
			
		}
		
		System.out.println(Arrays.toString(val));
		System.out.println(Arrays.toString(new_val));
	}
}


//3. 6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게
//숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//조건2. 중복된 숫자는 들어가지 못하게 할 것
//조건3. 배열을 새롭게 선언하고 중복된 값이 없는 형태로 내림차순 한다. (배열의 크기 하드코딩 x)
//ex) [1,3,4,1,2] => [4,3,2,1] (1은 중복되므로 하나의 값만 입력)
