package P_20211215.game.Ingeritance;

public class Magician extends Commoner{
	
	private int mDmg;
	public Magician(String id) {
		// TODO Auto-generated constructor stub
		super(id);
		mDmg = 7;
	}
	
	public void getInfo() {

		System.out.println("아이디 : " + id + "\n레벨: " + lv + "\nhp : " + hp + "\nmp : " + mp + "\n마법데미지 : "+mDmg);	
		
		System.out.println();
		
	}
}
