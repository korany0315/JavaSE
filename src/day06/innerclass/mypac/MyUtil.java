package day06.innerclass.mypac;

public class MyUtil {
	
	public String clsName = "MyUtil";
	
	
	//내부 클래스
	public class HelloPrinter{
		
		//메소드
		 public void name() {
			
		}
	}
	


	
	//static  내부 클래스
	public static class Calculator{
		//메소드
		public void calc(int a, int b) {
			int result = a + b ;
			System.out.println("전달받은 두 정수의 합:" + result);
		}
	}
	
}
