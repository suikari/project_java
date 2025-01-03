package d250102;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		Human k = new Human();
		
		
		h.name = "홍길동";
		h.age = 30;
		h.addr = "인천";
		h.height = 170.5;
		h.isSingle = true;
		
		h.eat();
		h.speak("홍길동");
		h.intro("홍길동",30,"인천");

		
		k.name = "김철수";
		k.eat();
		k.speak("김철수");
	}

}
