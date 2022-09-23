package day03.array;


public class MainClass03 {
	public static void main(String[] args) {
		// 배열객체 생성하기
		String[] names = new String[6];
		// 각각의 방에 이름을 정하기
		names[0] = "피카츄";
		names[1] = "라이츄";
		names[2] = "파이리";
		names[3] = "꼬부기";
		names[4] = "버터풀";
		names[5] = "야도란";
		
		//위와 같다
		//String[] names = { "피카츄", "라이츄", "파이리", "꼬부기", "버터풀", "야도란" };
		
		System.out.println(names[0]);
		System.out.println(names.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		// 배열의 내용을 출력해보기
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}