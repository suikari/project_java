package d250120;

import java.util.HashMap;

public class Person {

		String name;
		int age;
		private String mbti;
		
		public String getMbti() {
			return mbti;
		}


		public void setMbti(String mbti) {
			this.mbti = mbti;
		}


		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		
		void eat (String food ) {
			System.out.println(food+"를 먹는다.");
		}
		
		@Override
		public String toString() {
			return name +"의 mbti는 "  + mbti + "입니다.";
			
		}
		
		
		public static void main(String[] args) {
			Person hong = new Person("홍길동",30);
			
			hong.setMbti("ENFJ");
			System.out.println(hong);
			
			Student kim = new Student("김철수",25,"20201234",3);
			kim.setMbti("INTP");

			System.out.println(kim);
			System.out.println(kim.study("자바"));
			
			
			HashMap<String, Object> map = kim.getInfo();
			
			System.out.println(map.get("stuNo"));
			System.out.println(map.get("grade"));


		}
		
}


