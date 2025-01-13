package d250113;

import java.util.Scanner;

public class chkChar {

	public static void main(String[] args) {
		String[] splitstr;
		char[] eng = new char[26];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영문 텍스트를 입력하고 세미콜론을 입력하세요 : ");
        String str = scan.nextLine();
        
        str = str.replaceAll("[-+.^:,]","");
        str = str.split(";")[0];
        
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			if (ch >= 'a' && ch <= 'z') { 
				eng[ch - 'a']++; 
			}

		}
        
		for (char x = 'a'; x < 'z'; x++) {
			if (eng[x-'a'] > 0 ) {
				System.out.println(x + ":" + ((int) eng[x - 'a'])); 
			}	
		}
		
	}
}
