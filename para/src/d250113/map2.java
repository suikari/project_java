package d250113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class map2 {

		public static void main(String[] args) {
			
			HashMap<String, Object> map = new HashMap<>();
			
			String name = "";
			int age = 0;
			double height = 0;
			
			
//			map.put("name", "홍길동");
//			map.put("age", 30);
//			map.put("height", 170.5);
			
			
			Scanner sc = new Scanner(System.in);
			
			for (int i=0;i<3;i++) {
				ArrayList<Object> list = new ArrayList<>();

				System.out.print("이름을 입력하세요");
				//name = sc.next();
				list.add(sc.next());

				System.out.print("나이를 입력하세요.");
				//age = sc.nextInt();
				list.add(sc.nextInt());

				System.out.print("키를 입력하세요.");
				//height = sc.nextDouble();
				list.add(sc.nextDouble());
				
				map.put(""+ i +"번", list);
			}
			
			System.out.println(map.get("0번"));
			System.out.println(map.get("1번"));
			System.out.println(map.get("2번"));

		}
}
