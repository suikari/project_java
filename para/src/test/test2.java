package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		val = sc.nextInt() ; 
		
		if (val >= 50) { 
			System.out.println("50 이상 입니다.");
		} else {
			System.out.println("50 미만 입니다.");			
		}
	    
		sc.close();

	}
}
