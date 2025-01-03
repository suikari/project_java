package test;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		int val = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		val = sc.nextInt() ; 
	   
		if (val <= 0 ) { 
			System.out.println("처리 할수 없습니다.");
		} else {
			for (int i=1;i<=9;i++) {
				System.out.println(val + "*" + i + "=" + (val*i));				
			}
		}
	    sc.close();

	}
}
