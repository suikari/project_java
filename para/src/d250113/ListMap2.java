package d250113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {

	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			// 이름(name), 자바점수(java), 오라클점수(oracle), html점수(html)  
			// 점수는 0-100사이만 가능 
			
			System.out.print ("(1) 추가 (2) 수정 (3) 확인 (4) 종료");
			int menu = sc.nextInt();
			
			
			
			if (menu == 1 ) {
			
				
			String name;

			System.out.print("이름 : ");
			name = sc.next();
			
			map.put("name", name);
			map.put("java", chk("java",40));		
			map.put("oracle",  chk("oracle",35));
			map.put("html", chk("html",25));
			
			list.add(map);	
			} else if (menu == 2 ) {
				// 이름, 과목명, 점수 입력받아서 해당 학생 과목 수정
				String updatename = "" ;
				int updateindex = 0;
				boolean updateFlg = false;
				
				System.out.print("이름 : ");
				updatename = sc.next();
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).get("name").equals(updatename)) {
						updateindex = i;
						updateFlg = true;
						break;
					}
				}
				
				if(updateFlg) {
					String div;
					System.out.print("수정할 항목을 입력 하세요(java,oracle,html)");
					div = sc.next();
					
					if (div.equals("java")) {
						list.get(updateindex).put(div, chk(div, 40));
					} else if (div.equals("oracle")) {
						list.get(updateindex).put(div, chk(div, 35));					
					} else if (div.equals("html")) {
						list.get(updateindex).put(div, chk(div, 25));					
					} else {
						System.out.println("과목명을 잘못입력하셨습니다.");
					}
					
				} else {
					System.out.println("해당 이름의 학생은 존재하지않습니다.");
				}
				
				
			} else if (menu == 3 ) {
				System.out.println(list);
			} else if (menu == 4 ) {
				break;
			}
			
		}

	
	}
	
	public static int chk(String type, int max ) {
		Scanner sc = new Scanner(System.in);
		int val;
		int min = 0;
			
		while(true) {
		
			System.out.print(type + " 점수 : ");
			val = sc.nextInt();
			
			
			if (val >= min && val <=max) {
				return val;
			} else {
				System.out.println(type+" 점수값은 "+ min +"~"+ max +"사이로 넣어주세요.");
			}
				
		}
	}
}
