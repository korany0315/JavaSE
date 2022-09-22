package day02.basic;
/*
 * 성적
 * result = 96 변수선언
 * 
 * 90점 이상이면 수
 * 90미만 80점 이상이면 우
 * 80미만 70점 이상이면 미
 * 70미만 60점 이상이면 양
 * 나머지 가
 * 
 *  성적 : 결과값 수, 우, 미, 양, 가 중 한개
 * 
 */
public class MainClass09 {
	public static void main(String[] args) {
		int score = 96;
		String result = null;
		
		if(score >= 90) {
			result = "수";
		}else if(score >= 80) {
			result = "우";
		}else if(score >= 70) {
			result = "우";
		}else if(score >= 60) {
			result = "우";
		}else {
			result = "가";
		}
		System.out.println("성적 :" + result);
	}
// 이하는 필요가 없는이유는 어차피 80점 이상으로 넘어가면 미에서 우로 바뀌기 때문!
}
