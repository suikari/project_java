package d250110;

public class member {
	String name;
	int age;
	String arr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getArr() {
		return arr;
	}
	public void setArr(String arr) {
		this.arr = arr;
	}
	
	member(String name, int age, String arr){
		this.name = name;
		this.age = age;
		this.arr = arr;
	}
	
	member(){
		
	}
	
}
