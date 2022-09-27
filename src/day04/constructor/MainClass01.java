package day04.constructor;

import day04.constructor.mypac.Handphone;

/*
 * 
 * [[생성자 (Constructor)]]
 * 
 * 객체를 생성할때 호출하는 반환값이 없는 메소드. 정확히는 메소드 아니다.
 * 객체 초기화 목적에 사용
 * 
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Handphone hp = new Handphone();
		
		Handphone hp2 = new Handphone("아이폰");
		
		System.out.println("hp.model: "+ hp.model);
		System.out.println("hp2.model: "+ hp2.model);
				
		
	}

}
