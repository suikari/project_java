package d250113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import d250110.member;

public class ListMap1 {
	
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		String name = "";
		int age = 0;
		String arr = "";
		
		
		while(true) {
			System.out.print ("(1) 추가 (2) 확인 (3) 삭제 (4) 종료");
			menu = sc.nextInt();
			
			if ( menu==1 ) {
				HashMap<String, Object> map = new HashMap<>();
				String selectname = "" ;
				int updateindex = 0;
				boolean updateFlg = false;
				
				int point = 0;
				System.out.print("이름 : ");
				selectname = sc.next();
				//map.put("name", sc.next());
				System.out.print("포인트 : ");
				point = sc.nextInt();
				//map.put("point", sc.nextInt());

				
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("name").equals(selectname)) {
						updateindex = i;
						updateFlg = true;
						break;
					}
				}
				
				if(updateFlg) {
					System.out.println( list.get(updateindex).get("name") +"님은 중복 회원으로 포인트만 업데이트 됩니다." );
					list.get(updateindex).put("point", point);
				} else {
					map.put("name", selectname);
					map.put("point", point);
					
					list.add(map);				
				}
				
				
			} else if ( menu==2 ) {
				
				System.out.println("--------------------------------------");
				System.out.print("포인트를 확인할 사용자의 이름을 입력해주세요 : ");
				String  selectname = sc.next();
				boolean selectFlg = false;
				int selectindex = 0;
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("name").equals(selectname)) {
						selectindex = i;
						selectFlg = true;
						break;
					}
				}
				
				if(selectFlg) {
					System.out.println( list.get(selectindex).get("name") +"님의 포인트는 " +  list.get(selectindex).get("point") + "입니다." );
				} else {
					System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
				}
				
				
				//for (int i=0;i<list.size();i++) {
				//	System.out.println(list);
					//System.out.println((i+1) +". name : " + list.get(i).get("name") + " point : " + list.get(i).get("point"));		
				//}
			} else if(menu == 3) {
				System.out.println("--------------------------------------");
				System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
				String delname = sc.next();
				boolean deleteFlg = false;
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("name").equals(delname)) {
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
		
	}
}

