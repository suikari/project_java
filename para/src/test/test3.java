package test;

import java.util.Scanner;

public class test3 {
	
	public static void main(String[] args) {
		int val = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		val = sc.nextInt() ; 
		
		if (val >= 11  || val <= 0 ) { 
			System.out.println("계산 할수 없습니다.");
		} else {
		  if ( val % 2 == 0 ) {
			System.out.println("짝수");
		  } else {
			System.out.println("홀수"); 
		  }
		}	
	    sc.close();
	}
	
}
