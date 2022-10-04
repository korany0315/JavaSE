package day05.interfaceEx.mypac;

public class SmartPhone implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("페이스톡을 걸어요")
		
	}

	@Override
	public void receive() {
		System.out.println("페이스톡을 받아요!");
		// TODO Auto-generated method stub
		
		
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요!");
	
	

}
