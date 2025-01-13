package d250110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class mapEx2 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		String name = "";
		int age = 0;
		String arr = "";
		
		
		while(true) {
			System.out.print ("(1) 추가 (2) 확인 (3) 종료");
			menu = sc.nextInt();
			
			if ( menu==1 ) {
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.print("이름 : ");
				map.put("name",sc.next());
				System.out.print("나이 : ");
				map.put("age",sc.nextInt());
				System.out.print("주소 : ");
				map.put("arr",sc.next());
				list.add(map);
				
				menu = 0 ;
			} else if ( menu==2 ) {
				for (int i=0;i<list.size();i++) {
					System.out.println((i+1) +". 이름 : " + list.get(i).get("name") + " 나이 : " + list.get(i).get("age") + " 주소 : " + list.get(i).get("arr") );		
				}
				menu = 0 ;
			} else if ( menu==3 ) {
				break;
			}
			
		}  
			
			
			
//		for (int i=0; i<4 ;i++) {
//			System.out.print("이름을 입력하세요 >>");
//			String name = sc.next();
//			list.add(name);
//		}
//			
//		for (int i=0;i<list.size();i++) {
//			System.out.print(list.get(i) + "\t");
//				
//		}
//		// 동일한 가장큰 값이 있을경우 , 2개이상 동일한 길이의 이름 모두 출력
//		String longName = "";
//		
//		for (int i=0;i<list.size();i++ ) {
//			if (longName.length() < list.get(i).length() ) {
//				longName = list.get(i);
//			}
//		}
//		
//		System.out.println("\n가장 긴 이름 : " + longName);
	}

}
