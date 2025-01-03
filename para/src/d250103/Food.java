package d250103;

public class Food {
	private String name;
	private int price;
	
	Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	Food() {
		this("",0);
	}
	
	void sell() {
	
		System.out.println(price+"원에 팔았습니다.");
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	/*void setPrice(int price) {
		
		if (price < 0 || price > 50000) {
			//가격 재확인
			return;
		}
		
		this.price = price;
	}
	
	int getPrice(int price) {
		
		return this.price;
	}*/
	
}
