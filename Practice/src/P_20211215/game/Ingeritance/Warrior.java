package P_20211215.game.Ingeritance;

public class Warrior extends Commoner{
	
	private int pDmg;
	public Warrior(String id) {
		// TODO Auto-generated constructor stub
		super(id);
		pDmg = 7;
	}
	
	public void getInfo() {

		System.out.println("아이디 : " + id + "\n레벨: " + lv + "\nhp : " + hp + "\nmp : " + mp + "\n물리데미지 : "+pDmg);	
		
		System.out.println();
		
	}
}
