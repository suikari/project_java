package d241231;
import java.util.Scanner;

public class quiz2 {
	public static void	main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] arr =  new int[5];
		
		System.out.println("배열에 넣을 숫자 5개를 넣어주세요");
		for (int i = 0; i < arr.length ; i++) {
			
			arr[i] =  sc.nextInt();			
			
		}
			
	   for (int i=arr.length-1;i>-1;i--) {

		   System.out.println(arr[i]);
	   }	
	
	
	}
}
