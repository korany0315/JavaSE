package day04.method.mypac;

/*
 * [[메소드]]
 * 
 * 		어떤 특정 작업을 숫행하기 위한 명령문의 집합
 * 
 * 		접근 제어 (정적 ) 반환 타입 메소드 이름(매개변수) { //선언부
 * 			명령문 // 구현부
 * 			return 반환값
 * 
 * 
 * 
 * 
 * 
 */

public class MainClass01 {
	
	public static void main(String[] args) {
		//car 객체 생성하기
		
		Car car1 = new Car();
		
		Car car2 = new Car();
		
		car1.drive();
		car1.startEngine();
		
		car1.drive();
		
		System.out.println("car2 입니다.");
		car2.drive();
		car2.startEngine();
		car2.drive();
		
		
		boolean result = car2.getIsEngineStarted();
		System.out.println("result :"+ result);
		
		int resultNum = car2.sum(10, 5);
		System.out.println("resultNum:"+ resultNum );
	}

}
