package d250120;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Review_ListMap2 {

	public static void main(String[] args) {
		
		//이름,나이,주소 입력받아서 
		// map에 저장하고 list에 추가하기 3명
		Scanner sc = new Scanner(System.in);
		
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		
		HashMap<String, Object> map = new HashMap<>();		
		
		//String name;
		//int age;
		//String addr;
		
		System.out.print("이름을 입력하세요 : ");
		map.put("name",  sc.next()); 
		System.out.print("나이를 입력하세요 : ");
		map.put("age",  sc.nextInt()); 
		System.out.print("주소를 입력하세요 : ");
		map.put("addr",  sc.next()); 
		
		list.add(map);
		
		HashMap<String, Object> map1 = new HashMap<>();		

		
		System.out.print("이름을 입력하세요 : ");
		map1.put("name",  sc.next()); 
		System.out.print("나이를 입력하세요 : ");
		map1.put("age",  sc.nextInt()); 
		System.out.print("주소를 입력하세요 : ");
		map1.put("addr",  sc.next()); 
		
		list.add(map1);
			
		HashMap<String, Object> map2 = new HashMap<>();		

		System.out.print("이름을 입력하세요 : ");
		map2.put("name",  sc.next()); 
		System.out.print("나이를 입력하세요 : ");
		map2.put("age",  sc.nextInt()); 
		System.out.print("주소를 입력하세요 : ");
		map2.put("addr",  sc.next()); 
		
		list.add(map2);
		
		//System.out.println(list);
		for (int i=0;i<list.size();i++) {
			//if (list.get(i).get("name").equals(name)){ }
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("addr"));
			System.out.println(list.get(i).get("age"));
		}
		
		
		
		System.out.print("주소를 수정할 사람 이름 입력 : ");
		String name = sc.next(); 
		
		int index = -1;
		
		for (int i=0;i<list.size();i++) {
			if(list.get(i).get("name").equals(name)) {
				index = i;
			}
		}
		
		if (index > -1 ) {
			System.out.print("수정할 주소를 입력하세요 : ");
			String addrr = sc.next();
			list.get(index).put("addr",  addrr); 
		} else {
			System.out.println("해당 사람이 존재하지 않습니다.");
		}				
		
		System.out.println(list);
	}
	
}
