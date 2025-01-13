package d250109;

public class Car {

	String color;
	int speed;
	String div;
	
	
	Car (){
		this.color = "하얀색";
		this.div   = "기본차";
		this.speed = 0;
	}
	
	Car (String div, String name, int speed ){
		this.color = div;
		this.div   = name;
		this.speed = speed;		
		
	}
	
	void carInfo(){
		System.out.println("자동차의 이름은 " + div + "색상은 " + color + " 입니다");
	}
	
	void setInfo(String div, String name, int speed ){
		this.color = div;
		this.div   = name;
		this.speed = speed;		
	}	
	
	void speedUp(int speed){
		this.speed += speed;
		if ( this.speed > 200 ) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
			this.speed = 200;
		}
	}
	
	void speedDown(int speed){
		this.speed -= speed;
		if ( this.speed < 0 ) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = 0;
		}
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.carInfo(); // 자동차의 이름은 기본차, 색상은 하얀색 입니다.
		car1.setInfo("아반떼", "노란색", 0); // 0은 speed
		car1.carInfo(); // 자동차의 이름은 아반떼, 색상은 노란색 입니다.
		
		Car car2 = new Car("소나타","파란색",0);
		car2.carInfo(); // 자동차의 이름은 소나타, 색상은 파란색 입니다.
		car2.speedUp(10);
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		car2.speedUp(200); // 200 이상의 속도는 불가합니다. 200으로 변경됩니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
						 
		car2.speedDown(150); 
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
		car2.speedDown(200); // 0 미만의 속도는 불가합니다. 0으로 변경됩니다.
		System.out.println("현재 속도는 " + car2.getSpeed() + " 입니다.");
	}
	
}
