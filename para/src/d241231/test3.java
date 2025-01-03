package d241231;

public class test3 {
	public static void	main(String[] args) {

	   int arr[] = {3,5,2,7,10};
	   int sum = 0;
	   int max = 0;
	   
	   for (int i = 0; i < arr.length;i++) {
		 if (i == 0 ) { max = arr[i];} 
		 sum += arr[i];
	   }
	   
	   
	   System.out.println(sum);
	   System.out.println(max);
	}
}
