package d250106;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticEx1.PI);
		int sum = StaticEx1.staticSum(1, 5);
		
		StaticEx1 ex1 = new StaticEx1();
		ex1.money = 45000;
		
		StaticEx1 ex2 = new StaticEx1();
		//ex2.money = 55000;
		
		System.out.println(sum);
		
		System.out.println(ex1.money);

		System.out.println(ex2.money);
		Human kim = new Human("김철수",20,"제주도");
		kim.money = 80000;
		
	}

}
