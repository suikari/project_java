package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGuDan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("랜덤 구구단 입니다. 0을 입력하면 종료됩니다.");
		int total = 0;
		int count = 0;
		while(true) {
			int x = ran.nextInt(8)+2; // 2~9
			int y = ran.nextInt(9)+1; // 1~9
			System.out.print(x+" * "+y+" = ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("종료되었습니다.");
				System.out.println(total + "문제 중 " + count + "개 맞추셨습니다.");
				// oo문제중 00문제 맞추셨습니다.
				break;
			} else if(answer == x*y) {
				System.out.println("정답입니다.");
				count++;
				total++;
			} else {
				System.out.println(
						"오답! 정답은 " + (x*y) + " 입니다."
				);
				total++;
			}
		}
		
	}

}
