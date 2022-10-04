package day06.thread;

import day06.thread.mypac.MyThread;



/*스레드
 * 
 * 메인메소드가 추가되서 같이 동작한다고 생각하면 됨
 * 병렬 실행
 * 비동기 실행 == 따로 독립적으로 실행되는것
 * 
 * 
 * 새로운 스레드 실행시키는 방법
 * 
 * 1. Thread 객체를 생성할 수 있는 클래스를 정의 한다.
 * 2. 정의한 클래스를 이용해서 객체를 생성
 * 3. 생성된 객체의 start() 메소드를 호출한다. // run 메소드 아님!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println(" 메인 스레드 시작");
		MyThread tread1= new MyTread();
		tread1.start();
		
		try {
			Thread.sleep(2000);
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("메인ㅁ쓰레드가 종료됩니다");
	}

}
