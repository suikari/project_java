package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class test6 {
	
	
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
					
		System.out.println(" === 학생 관리 시스템 입니다! === ");

		while (true) {
			HashMap<String, Object> map = new HashMap<>(); 
			System.out.print("[(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료 ]");
			int menu = sc.nextInt();
			
			if (menu==1) {
				
				System.out.print("이름 입력 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
				} else {
					map.put("name",name);
					list.add(map);
					System.out.println("학생이 추가되었습니다!");
				}
				

				
			} else if (menu==2) {
				System.out.print("성적을 입력할 학생 이름 입력 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					int java = insertVal(0, 100,"java : ");		
					list.get(index).put("java",  java); 
					
					int oracel = insertVal(0, 100,"oracel : ");		
					list.get(index).put("oracel",  oracel); 
					

				} else {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}

				
			} else if (menu==3) {
				System.out.println("ArrayList 객체를 그대로 출력합니다.");
				System.out.println(list);
				
			} else if (menu==4) {
				System.out.print("성적을 수정할 학생 이름 입력 : ");
				String name = sc.next(); 
				
				int index = selectIndex(list,name);

				if (index > -1 ) {
					
					System.out.print("수정할 과목명(java, oracle) : ");
					String sub = sc.next();
					
					if (sub.equals("java")) { 
						int java = insertVal(0, 100,"java : ");		
						list.get(index).put("java",  java); 
					} else if (sub.equals("java")) { 
						int oracel = insertVal(0, 100,"oracel : ");		
						list.get(index).put("oracel",  oracel); 
					} else {
						System.out.println("없는 과목입니다. 메뉴로 이동 합니다.");
					}

				} else {
					System.out.println("해당 학생이 존재하지 않습니다.");
				}				
				
			} else if (menu==5) {
				System.out.println("종료되었습니다.");
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


