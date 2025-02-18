package d250121;

public abstract class Animal {
	private String name ;
	private int age;
	
	Animal(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	void sound() {
		System.out.println("소리를 낸다");
	}
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
}
