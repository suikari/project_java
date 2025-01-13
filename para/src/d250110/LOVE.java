package d250110;

import java.util.Scanner;

public class LOVE {
	public static void main(String[] args) {
		
		String value = "";
		Scanner sc =  new Scanner(System.in); ;
		
		System.out.print("문자열을 입력하세요");
		
		value = sc.next();
		value = value.trim();

//
//		for (int i=1;i<value.length();i++) {
//			System.out.println(value.substring(i) + value.substring(0,i) );
//		}
//		System.out.println(value.substring(0));
		
		
		for (int i=value.length();i>0;i--) {
			System.out.println(value.substring((value.length()-i+1)) + value.substring(0,(value.length()-i+1)) );
		}
	}
}
