package d250103;

import java.util.Objects;

public class Human {
	String name;
	int age;
	String addr;
	
	void study() {
		System.out.println("공부를 합니다.");
	}
	
	String eat (String food) {
		return food + "를 먹습니다.";
	}
	
	Human(String name, int age, String addr) {		
		this.name  = name;
		this.age   = age;
		this.addr  = addr;
	}
	
	Human(String name, int age) {
		this(name,age, "알 수 없음");
		//this.name  = name;
		//this.age   = age;
	}
	
}
