package d250109;

public class Animal {
	String name ;
	int age;
	String div;
	
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal animal = new Animal("동물", 5);
        animal.info(); // 이름 : 동물, 나이: 5
        animal.sound(); // 동물이 소리를 냅니다.

        // Dog 객체 생성
        Dog dog = new Dog("바둑이", 3, "진돗개");
        dog.info(); // 이름 : 바둑이, 나이 : 3
        dog.sound(); // 멍멍!
        System.out.println("품종 : " + dog.getBreed()); // 품종 : 진돗개
        
        Dog dog2 = new Dog();
        dog2.info(); // 이름 : 정보없음, 나이 : 0
        
	}

	protected void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}

	protected void info() {
		// TODO Auto-generated method stub
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
	
}


