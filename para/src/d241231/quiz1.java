package d241231;
import java.util.Scanner;

public class quiz1 {
	public static void	main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] v_value =  new int[5];
		int min = 0;
		
		for (int i = 0; i < 5 ; i++) {
			
			v_value[i] =  sc.nextInt();
			if (i ==0 ) { min = v_value[i];}
			
			//if (min > v_value[i] ) { min = v_value[i]; }
			
			min  =  min >  v_value[i]  ?  v_value[i]  : min;
		}
			
		System.out.print(min);
	}
	
	
}
