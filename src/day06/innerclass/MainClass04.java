package day06.innerclass;

public class MainClass04 {
	public static void main(String[] args) {
		

	Soldier s = new Soldier(new Weapon () {
		
		private void attack() {
			System.out.println("솔저 공격");
			// TODO Auto-generated method stub

		}
	});

		 Soldier s = new Soldier(w);
}
}