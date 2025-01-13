package d250110;

import java.util.ArrayList;
import java.util.HashMap;

public class mapEx1 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("name", "홍길동");
		map.put("age", "30");
		map.put("height", "180.5");
		map.put("div", "회사원");
		
		list.add(map);
		
		System.out.print(list);
	}
}
