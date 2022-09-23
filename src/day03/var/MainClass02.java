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
 *  	
 * 
 */

public class MainClass02 {
	static String str1 = "전역변수";

	public static void local() {
		String str2 = "지역변수";
	}

	public static void main(String[] args) {
		System.out.println(str1);
//		System.out.println(str2); 에러! 다른메소드의 지역변수를 사용
		
		
		Card c1 = new Card();
		//카드 객체 생성
		 System.out.println(c1.height);
		 System.out.println(c1.type);

		class Card {
			static int height = 20;
			String tyoe = "클로버";

		}

	}

}
