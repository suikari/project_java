package d250102;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal l = new Animal();
		Animal b = new Animal();
		
		
		
		l.name = "lion";
		l.age = 4;
		
		l.eat(true);
		l.speak();
		l.love();
		
		b.name = "bear";
		b.age = 8;
		
		b.eat(false);
		b.speak();
		b.love();
				
	}

}
