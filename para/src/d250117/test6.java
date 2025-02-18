package d250117;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test6 {
	
	
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		//과일가게 1, 추가 2, 판매 3, 확인 4, 종료
		
		
		while (true) {
			HashMap<String, Object> map = new HashMap<>();
			
			System.out.print("[(1) 추가 (2) 판매 (3) 확인 (4) 종료 ]");
			int menu = sc.nextInt();
			
			if (menu==1) {
				//map에 이름 가격 개수 를 입력받아 list에 저장
				
				System.out.print("과일명을 입력하세요 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					int val = insertVal(0, (int)list.get(index).get("val"), "중복 과일 입니다. 추가 할 수량을 입력하세요 : ");		
					list.get(index).put("val",  (int)list.get(index).get("val") + val); 
				} else {
					map.put("name",name);
					map.put("sal",insertVal(100,100000,"수량을 입력하세요 : "));
					map.put("val",insertVal(1,300,"금액을 입력하세요 : "));
					
					list.add(map);
				}
				

				
			} else if (menu==2) {
				System.out.print("판매할 과일명을 입력하세요 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					int val = insertVal(0, (int)list.get(index).get("val"),"판매할 수량을 입력하세요 : ");		
					list.get(index).put("val",  (int)list.get(index).get("val") - val); 
					
					System.out.print(name + "를 "+ val + "개 판매하고 " + (int)list.get(index).get("val")  + "개 남았습니다. 입력하세요 : ");

				} else {
					System.out.println("해당 과일은 재고가 없습니다. ");
				}

				
			} else if (menu==3) {
				System.out.print("확인할 과일명을 입력하세요 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				
				if (index > -1 ) {
					int val = (int)list.get(index).get("val");
					System.out.println("해당 과일은 재고가 " + val + "개 남았습니다.");
				} else {
					System.out.println("해당 과일은 재고가 없습니다. ");
				}
				
			} else if (menu==4) {
				break;
				
			} else  {
				System.out.println("입력값을 초과했습니다. 다시입력해주세요.");
			}
			
			
		}
		
		
		
		
	}
	static public int selectIndex (ArrayList<HashMap<String, Object>> list , String name) 
	{
		int index = -1;
		
		for (int i=0;i<list.size();i++) {
			if(list.get(i).get("name").equals(name)) {
				index = i;
			}
		}
		
		return index;
		
	}
	
	static public int insertVal (int min , int max, String text) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print(text);
			
			int val = sc.nextInt();
			
			if ( val > min && val < max ) {
				return val;
			} else {
				System.out.println(min + " ~ "+ max + " 사이의 값을 입력해주세요.");
			}
			
		}
		
	}
}
