package d241231;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;

public class test1 {
     
	public static void	main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] v_value =  new int[5];
		int v_max = 0 ;
		int v_min = 0 ;
		int v_sum   = 0 ;
		int v_avg   = 0 ;
		
		for (int i=0; i <=4; i++ ) {

		   
		   v_value[i] = sc.nextInt();
		   
		   if (i == 0) {
			   v_max = v_value[i];
			   v_min = v_value[i];
		   }
		  
		   v_max = Math.max(v_max, v_value[i]);
		   v_min = Math.min(v_max, v_value[i]);
		   v_sum  += v_value[i];
		   
		}
		
		v_avg =  ( v_sum / v_value.length ) ;  
				
		System.out.print(v_max + "," +v_min + "," + v_sum + "," + v_avg);

	}
	
	
	
	  
}
