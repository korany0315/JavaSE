package day02.basic;

/*
 * 증감 연산자
 * 
 * ++ : 1씩 증가 시킨다.
 * -- : 1씩 감소시킨다.
 * 
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println("1 증가 시킨 후 :"+num);
		num++;
		System.out.println("1 증가 시킨 후 :"+num);
		
		
		// 0~99 까지 출력하는 for문
		for(int i=0; i < 100; i++) {
			System.out.println(i+" ");
		}
		
		System.out.println();
		
		
		
		// 변수의 값을 1씩 감소 시키기
		int num2 = 0;
		num2 = num2 -1;
		System.out.println("1 감소 시킨 후 :"+num2);
		num2--;
		System.out.println("1 감소 시킨 후 :"+num2);
		
		for(int i=99; i >=0; i--) {
			System.out.println(i+" ");
			
			     
		}
		
		
	}

}
