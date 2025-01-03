package test;

public class test6 {
	public static void main(String[] args) {

		for (int i=1;i<=9;i++) {
			if ( i==5 || i==8  ) {
			} else {
			
			System.out.println(i+"단");
	
			for (int j=1;j<=9;j++) {
	
				System.out.print(i + "*" + j + "=" + (i*j) + " ");				
			
			}	
			
			System.out.println();
			}
		}
	}
}
