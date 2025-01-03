package test;

import java.util.Random;
import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {

		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		boolean flg = false;
		
		int input = 0;
		int count = 0;
		
	    int rnd_num = random.nextInt(100)+1; 
	
	    try {

		    do {
				System.out.print("숫자를 입력하세요 : ");
				input = sc.nextInt();
				
				if ( rnd_num > input  ) {
					System.out.println("=======================");
					System.out.println("UP!");
					System.out.println("=======================");
				} else if (  rnd_num < input) {
					System.out.println("=======================");
					System.out.println("DOWN!");
					System.out.println("=======================");
				} else if (rnd_num == input ) {
					System.out.println("정답입니다.");
					flg = true;			
				} else {
					System.out.println("잘못입력!");							
				}
			 count++;	
		    } while (!flg);
		    
		    System.out.println(count+"번 만에 맞추셨습니다.");
	    } catch (Exception e) {
	        System.out.println("값을 잘못입력 하셨습니다.");
	    }
	    
	    sc.close();  

	}
}
