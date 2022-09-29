package day05.abstractEx;

import day05.abstractEx.mypac.Woman;

/*
 * [[추상 클래스(Abstract)]]
 * 
 *구현되지 않은 추상 메소드가 존재한다. 
 * 정의만 하고 구현 하지 않음
 * 미완성 메소드 가지고있다.
 * 상속 받고 반드시 오버라이딩 해야한다.
 * 
 * 만드는 방법 : class 예약어 앞에 abstract 를 붙여준다.
 * 
 */
public class MainClass01 {
	
	public static void main(String[] args) {
		
		Woman w = new Woman();
		w.dance();
		w.say();
		
	}

}
