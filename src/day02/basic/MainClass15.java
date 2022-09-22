package day02.basic;
/*
 * for문으로 하는걸 while 문으로 만들어보기
 * 
 * for 문을 가장 많이 씀 ! 가독성도 좋고 while을 잘못쓰면 무한루프를 돌 수 도있음
 * 
 */
public class MainClass15 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
	}

}
