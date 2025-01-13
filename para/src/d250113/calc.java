package d250113;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
	
	public static void main(String[] args) {
		
		
		
		
		int num1;
		int num2;


		while(true) {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("나뉘는 수 : ");
				num1 = sc.nextInt();
				System.out.println("나누는 수 : ");
				num2 = sc.nextInt();	
				
				System.out.println(num1/num2);
				
				break;
				
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌수 없습니다.");
			} catch (InputMismatchException e) {
				//System.out.println(e.getMessage());
				System.out.println("입력오류가 발생했습니다.");
			} catch (Exception e ) {
				System.out.println("예기치 못한 에러가 발생했습니다.");
			}
		}
	}
}
