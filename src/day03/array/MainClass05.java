package day03.array;
/*
 * 2중 배열 숙제
 *  
 * 1  2  3  4  5  6  7 
 * 8  9 10 11 12 13 14
 *15 16 17 18 19 20 21
 *22 23 24 25 26 27 28
 *29 30 31 32 33 34 35
 *36 37 38 39 40 41 42 
 *43 44 45 46 47 48 49
 *
 *을 사선 지그재그로 출력해오기
 * 1. 이중배열 선언하고
 * 2. for문으로 값을 1~49까지 위모양으로 넣으세요
 * 3. 출력은 지그재그
 * 		출력순서 1 8 2 3 9 15 22 16 10 4 5 11 17 ...48 42 49 
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		int[][] nums = {1,2,3},
				       {4,5,6},
				       {7,8,9},
				       {10,11,12}
					};
					
					for(int i=0; i<4; i++ ) {
						for(int j=0;, j<3; j++) {
							System.out.print(nums[i][j] + "  ");
						}
						System.out.println();
				
		
	}
}
