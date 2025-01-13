package d250108;

public class ColorTV extends TV {
	private int color;
	public ColorTV(int size ,int color) {
		this(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public ColorTV(int size) {
		super(size);
	}
	
	
	public void printProperty() {
		System.out.println( getSize() + "인치 " + this.color + "컬러");
	}

	protected int getColor() {
		return color;
	}


}
