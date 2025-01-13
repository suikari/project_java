package d250107;

public class Person {
	String name;
	int age;
	String addr;
	
	Person(String name, int age, String addr) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void eat() {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잔다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
