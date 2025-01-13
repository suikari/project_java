package d250113;

import java.util.HashMap;

public class map1 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		
		map.put("name", "홍길동");
		map.put("age", "30");
		
		String ageStr = map.get("age");
		
		int age = Integer.parseInt(ageStr)+1;
		System.out.println(age);
		
	}
}
