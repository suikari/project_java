package d250106;

public class FruitMain {
	
	public static void main(String[] args) {
		
		Fruit orange = new Fruit("오렌지",1500,5);
		
		orange.toString2();
		int num = orange.getNum();
		System.out.println(num);
		
		Fruit banana = new Fruit("바나나",2000);
		
		banana.setNum(10);
		num = banana.getNum();
		System.out.println(num);
				
		
	}
}
