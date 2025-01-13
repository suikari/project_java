package d250109;

public class Dog extends Animal {
	String Breed ;
	
	public Dog(String name, int age, String Breed) {
		super(name,age);
		this.Breed = Breed;
	}

	public Dog() {
		super("정보없음",0);
		// TODO Auto-generated constructor stub
	}

	public String getBreed() {
		// TODO Auto-generated method stub
		return Breed;
	}
	
	protected void sound() {
		System.out.println("멍멍!");
	}
	
//	void info() {
//		// TODO Auto-generated method stub
//		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
//	}
	
}