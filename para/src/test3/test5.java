package test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class test5 {
	
	
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
					
		System.out.println(" === 과일 가게 프로그램 === ");

		while (true) {
			HashMap<String, Object> map = new HashMap<>(); 
			System.out.print("===== (1) 과일 추가 (2) 과일 삭제 (3) 가격수정 (4) 현황 파악 (그외) 종료 =====");
			int menu = sc.nextInt();
			
			if (menu==1) {
				
				System.out.print("이름 입력 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					int add_val = insertVal(0, 100,"해당 과일은 이미 등록되어있음으로 추가할 수량을 입력하세요 : ");		
					list.get(index).put("count",  add_val); 
					
				} else {
					map.put("name",name);
					map.put("price",insertVal(100, 10000," 과일의 가격을 입력하세요 : "));
					map.put("count",insertVal(0, 100," 과일의 수량을 입력하세요 : "));
					list.add(map);
					System.out.println("과일이 추가되었습니다!");
				}
				

				
			} else if (menu==2) {
				System.out.print("재고삭제 과일 이름 입력 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					/*
					 * int java = insertVal(0, 100,"java : "); list.get(index).put("java", java);
					 * 
					 * int oracel = insertVal(0, 100,"oracel : "); list.get(index).put("oracel",
					 * oracel);
					 */
					list.remove(index);
					System.out.println("해당 과일을 재고처리했습니다.");

				} else {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}

				
			} else if (menu==3) {
				
				System.out.print("가격을 수정할 과일 이름 입력 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					
					int price = insertVal(100, 10000,"가격을 수정해주세요(기존 가격 "+ list.get(index).get("price")+" ) ");		
					list.get(index).put("price",  price); 
					
				} else {
					System.out.println("해당 과일이 존재하지 않습니다.");
				}
				
			} else if (menu==4) {
				
				for ( int i=0;i<list.size();i++ ) {
					System.out.println(list.get(i).get("name") + "의 가격은 " + list.get(i).get("price") + "원, 개수는 " + list.get(i).get("count") + "개 남았습니다." );
				}
				
					
				
			} else  {
				System.out.println("종료되었습니다.");
				break;			
			}
			
			
		}
		
//		int [10]p = new int[10];
//		int ppp[] = new int[10];
//		int po[10] = new int[10];
//		int[] pp;
		
		
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


