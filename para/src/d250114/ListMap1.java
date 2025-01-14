package d250114;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListMap1 {
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		//[{name:홍길동, age : 30}]
		
		HashMap<String, Object> user1 = new HashMap<>();
		
		user1.put("name", "홍길동");
		user1.put("age", 30);
		list.add(user1);
		
		HashMap<String, Object> user2 = new HashMap<>();
		user2.put("name", "김영희");
		user2.put("age", 20);
		list.add(user2);
		
		
		
		System.out.println(list);
		
		for (int i=0; i<list.size();i++) {
			if ("김철수".equals(list.get(i).get("name"))) {
				list.get(i).put("addr", "인천");
			}
		}
	}
}
