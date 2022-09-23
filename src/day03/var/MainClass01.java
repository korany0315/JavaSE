package day03.var;
/*
 *  [[변수 (variable]]
 *  
 *  1. 타입에 따른 변수
 *  		기본형 - 예약어 소문자로 시작하고 값을 가지고 잇다.
 *  				8가지 boolean, byte, short, int , long, char, float, double  
 *  		참조형 - 대문자로 시작을 하고 주소값을 가지고있다.
 *  				기본형 외 나머지 전부!!
 *  				ex) String
 *  2. 선언 위치에 따른 변수
 *  	전역 변수 (글로벌 변수) - 클래스 안에 선언
 *  	지역 변수 - 메소드 또는 생성자 {} 괄호 안에 선언
 *  3. 정적/ 동적 변수
 * 
 */
public class MainClass01 {
	String globalStr = "전역변수";
	public static void main(String[] args) {
	Car car1 = new Car();
		System.out.println(car1.color);
		car1.autopilot();
	}
		
	}
class Car {
	//전역 변수
	String color = "red";
	
	public void drive() {
		int speed = 80;
		System.out.println(speed + "속도로 달려요!");
	}
	
	public void autopilot() {
		drive();
		System.out.print(color +" 색 차가 ");
		System.out.println("자율주행을 해요!");
	}

}
