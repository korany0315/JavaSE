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
 *  3. 정적(static) / 동적 변수
 *  	statix - JVM Static area 에 올라가는 변수
 *  				보통 공통값을 선언한다.
 *  	동적 - static 외 전부
 *  			동적인 값 대입
 * 
 */

public class MainClass03 {

	public static void main(String[] args) {
	
		
		Card c1 = new Card(); // 첫번쩨 카드 객체 생성
		Card c2 = new Card(); // 두번째 카드 객체 생성
		
		c1.tyoe = "클로버";
		c2.tyoe = "다이아몬드";
		c1.height = 30;
		c2.height = 15;
		
		Card.height = 20;
		
		
		 System.out.println("height : " + c1.height); 
		 System.out.println("type : " +c1.tyoe);
		 //첫번째 카드
		 
		 System.out.println("height : " +c2.height);
		 System.out.println("type : " + c2.tyoe);
		 //두번째 카드
	}

	}

		class Card {
			static int height = 20;
			String tyoe = "";

	
}
