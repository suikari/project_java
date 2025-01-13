package d250110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<member> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		String name = "";
		int age = 0;
		String arr = "";
		
		
		while(true) {
			System.out.print ("(1) 추가 (2) 확인 (3) 삭제 (4) 종료");
			menu = sc.nextInt();
			
			if ( menu==1 ) {
				member mem = new member();
				
				System.out.print("이름 : ");
				mem.setName(sc.next());
				System.out.print("나이 : ");
				mem.setAge(sc.nextInt());   
				System.out.print("주소 : ");
				mem.setArr(sc.next());				
				list.add(mem);
				
			} else if ( menu==2 ) {
				for (int i=0;i<list.size();i++) {
					System.out.println((i+1) +". 이름 : " + list.get(i).name + " 나이 : " + list.get(i).age + " 주소 : " + list.get(i).arr );		
				}
			} else if(menu == 3) {
				System.out.println("--------------------------------------");
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String delname = sc.next();
				boolean deleteFlg = false;
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).name.equals(delname)) {
						list.remove(i);
						deleteFlg = true;
						break;
					}
				}
				if(deleteFlg) {
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				System.out.println("--------------------------------------");
			} else if(menu == 4){
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("1~4중에 선택해 주세요.");
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
