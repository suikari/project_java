package test3;

public class Human {
	String name;
	int age ;
	String phone;
	

	
	public String getPhone() {
		return phone;
	}

	public boolean setPhone(String phone) {
		
		if( phone.length() > 12 ) { 
			System.out.println("핸드폰번호는 11글자로 입력해주세요.( - 제외 )");
			System.out.println("ex) 01012341234");
			return true;
		} else {
			this.phone = phone;
			
			return false;
		}
		

	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return name +"의 나이는 " + age + " 입니다.";
		 
	}

}
