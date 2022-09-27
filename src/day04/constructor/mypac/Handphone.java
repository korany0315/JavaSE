package day04.constructor.mypac;

public class Handphone {
	public String model;
	
	// 디폴트 생성자 
	public Handphone() {
		this.model = "갤럭시";
		//System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	
	//오버로딩 생성자
	public Handphone(String model) {
		this.model = model;
		//System.out.println("생성자로 "+ name +"이 전달 되었습니다.");
	}
	

}
