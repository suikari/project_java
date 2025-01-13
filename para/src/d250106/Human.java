package d250106;

public class Human {

	String name;
	int age;
	String addr;
	public int money_708 = 2000000;
	int money;
	
	void intro() {
		System.out.println(name + "의 나이는" + age + ", 주소는 " + addr + " 입니다." );
	}
	
		
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
