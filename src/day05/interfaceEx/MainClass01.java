package day05.interfaceEx;

import day05.interfaceEx.mypac.AkWeapon;
import day05.interfaceEx.mypac.Weapon;

/*
 * [[인터페이스]]
 * 
 * 추상 메소드만 있다
 * 상수선언까지 허용
 * 뼈대를 만들어준다.
 * 
 * 사용방법 - class가 아닌 인터페이스 예약어로 선언한다.
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		AkWeapon ak = new AkWeapon();
		ak.attack();
		ak.attackSky();
		ak.NAME = "abcd";
		System.out.println(ak.NAME);
		
		//다형성
		Weapon ak2 + new AkWeapon();
		
		ak2.attack();
		ak2.autoAttack();
		
		
		
	}

}
