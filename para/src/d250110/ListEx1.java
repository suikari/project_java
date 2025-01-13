package d250110;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<4 ;i++) {
			System.out.print("이름을 입력하세요 >>");
			String name = sc.next();
			list.add(name);
		}
			
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + "\t");
				
		}
		// 동일한 가장큰 값이 있을경우 , 2개이상 동일한 길이의 이름 모두 출력
		String longName = "";
		
		for (int i=0;i<list.size();i++ ) {
			if (longName.length() < list.get(i).length() ) {
				longName = list.get(i);
			}
		}
		
		System.out.println("\n가장 긴 이름 : " + longName);
	}
}
