package d250108;

public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		   
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty();
		   
	}

}
