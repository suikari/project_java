package d250102;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,10,2,7} ;
		int max = 10;
		boolean flag = true;
		
		for (int i=0;i<arr.length;i++) {
			flag = true;
			
			for (int j=0;j<arr[i];j++) {
				if (max > arr[i] && flag ) {
					for (int k=0;k<max-arr[i];k++) {
						System.out.print(" ");
					}
					flag = false;
				}
				
				System.out.print("*");
			}
			System.out.println();	
		}
		
	}

}
