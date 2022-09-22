package day02.basic;

/*
 * 비교 연산자
 * 
 * >  : 크다
 * >= :크거나 같다
 * <  : 작다
 * <= : 작거나 같다
 * == : 같다 ( =은 이미 변수에서 쓰고있어서)
 * != : 다르다
 * 
 * 
 * 

 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result = 10 > 20;
		
		result = 10 <= 20;
		if(result)
			System.out.println("10은 20보다 작거나 같아요");
		
		result = 10 == 10;
		if(result)
			System.out.println("10과 10은 같아요");

		result = 10 != 20;
		if(result)
			System.out.println("10과 20은 달라요");
	}

}
