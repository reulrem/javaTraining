package P_20211215.game.Ingeritance;

public class Archer extends Commoner{
	
	private int rDmg;
	public Archer(String id) {
		// TODO Auto-generated constructor stub
		super(id);
		rDmg = 7;
	}
	
	public void getInfo() {

		System.out.println("아이디 : " + id + "\n레벨: " + lv + "\nhp : " + hp + "\nmp : " + mp + "\n원거리데미지 : "+rDmg);	
		
		System.out.println();
		
	}
}
