package test2;


public class Car implements carManager {
	int speed;
	String color;
	String kind;
	
	
	public Car(String kind, int speed, String color) {
		this.kind = kind;
		this.speed = speed;
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "차의 종류는 "+ this.kind + ", 색은 " + this.color +" 입니다.";
	}
	
	@Override
	public void SpeedUp(int speed) {
		this.speed += speed;
		if ( this.speed > 200 ) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}
	}

	@Override
	public void SpeedDown(int speed) {
		this.speed -= speed;
		if ( this.speed < 0 ) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		}
	}

	@Override
	public int getSpeed() {
		
		return this.speed;
	}
	
	public static void main(String[] args) {
		Car c = new Car("소나타", 0, "검정");
		System.out.println(c);
		
		c.SpeedUp(100);
		System.out.println(c.getSpeed());
		c.SpeedUp(150);
		System.out.println(c.getSpeed()); 
		c.SpeedDown(30);
		System.out.println(c.getSpeed()); 
		
	}
}
