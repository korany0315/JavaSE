package day03.basic;

import java.util.Iterator;
/*
 * for반복문 연습
 * 
 *  숙제 별찍기 for문과 if문 을 이용해서 만들기
 *  
 *  1번 
 
	    *
	   **
	  ***
	 ****
	*****
   ******
  *******


2번 
	    *
	   ***
	  *****
	 *******
	*********
   ***********
  *************


3번

      *
     ***
    *****
   *******
    *****
     ***
      *


 *  
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		for (int i =0; i<7; i++) {
			for (int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
