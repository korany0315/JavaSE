package day06.exception;

import java.util.Random;

public class MainClass02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		Random ran = null;
		
		try {
			
			ran.nextInt();  	//null 에러
			
			result = num1/num2;
			
			System.out.println("----------------");
			
		} catch (ArithmeticException ne) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
				
		} catch (NullPointerException ne) {
			System.out.println("null 포인트 익셉션이 발생했습니다.");
	
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			
		}
	}

}
