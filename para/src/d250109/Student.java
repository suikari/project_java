package d250109;

public class Student {
	private int stuNo;
	private String stuName;
	private String stuDept;
	private int age;
	private String gender;
	
	Student(int stuNo, String stuName){
		this.stuNo = stuNo;
		this.stuName = stuName;	
	}

	Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;

	}
	
	void setInfo (int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		
		return (this.stuName + "학생의 학번은 " + this.stuNo + ", 나이는 " + this.age + " 입니다.");
	}
	
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		 Student hong = new Student(1234,"홍길동");
		 Student yu = new Student(1234,"유재석","컴퓨터학과");
		 hong.setInfo(20,"남");
		 int age = hong.getAge();
		 System.out.println(age);
		 System.out.println(yu.toString());
	}
	
}
