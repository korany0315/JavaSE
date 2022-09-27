package day04.method.mypac;

public class Car {
	//엔진이 시동이 걸렸는지 저장하는 멤버 필드
	private boolean isEngineStarted = false;
	
	
	//멤버 메소드
	public void drive()
	{
		if(isEngineStarted) {
			System.out.println("차가 움직여요!");
	
		}else {
			System.out.println("엔진이꺼져있어서 움직일 수 없어요!");
		}
	}

	
	//엔진을 정지시키는 메소드
	public void stopEngine() {
		isEngineStarted = false;
		System.out.println("엔진이 꺼졌습니다.");
	}
	//엔진을 다시 켜는 메소드
		public void startEngine() {
			isEngineStarted =true;
			System.out.println("엔진이 켜졌습니다.");
		}
		
		
		public boolean getIsEngineStarted() {
			return isEngineStarted;
		}
		
		public int sum(int a, int b) {
			return a+b ;
		}
}
