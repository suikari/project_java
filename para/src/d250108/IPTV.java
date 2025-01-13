package d250108;

public class IPTV extends ColorTV {
	String ip;
	
	public IPTV(int size, int color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}
	
	public IPTV(String ip ,int color, int size) {
		super(color, size);
		this.ip = ip;
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " 주소의");
		super.printProperty();
	}
}
