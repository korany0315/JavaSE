package day02.basic;
/*
 * 반복문 while
 * 
 * while (조건문) {
 * ...반복 수행할 문장.
 * }
 * 
 * 
 */

public class MainClass12 {
	public static void main(String[] args) {
		//while문을 이용해서 0~99까지 출력해보기
		int count=0; //카운트를 세기위한 변수
		while(true) {
			System.out.println(count+" ");
			count++; //카운트 증가
			 if(count==100)
				 break; //할거했으면 브레이크를 해서 while문을 벗어나서 다음으로 넘어가기
			 
	/*
	 * 다른형태로 사용하기
	 * 
	 */
	count= 0; //카운트 초기화
	boolean isRun= true;
	while(isRun) {
		System.out.println(count+"  ");
		count++;
		if(count==100)isRun=false;	
	}
	System.out.println(); //개행하기
	
	count=0; //카운트 초기화
	while(count<100) {
		System.out.println(count+"  ");
		count++;
		
	
	
	
		}
	}


}
