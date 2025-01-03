package d250102;

public class Animal {
	String name;
	int age;
	
	void eat( boolean o ) {
		if (o) {
			System.out.println(name + "은 육식 동물이다.");
		} else {
			System.out.println(name + "은 초식 동물이다.");
		}
	}
	 
	void speak() {
		System.out.println(name + "은 말을 할 수 있다.");
	}
	
	void love() {
		System.out.println(name + "은 " + age + "부터 생식을 한다.");		
	}
	
	
}
