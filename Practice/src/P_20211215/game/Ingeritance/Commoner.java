package P_20211215.game.Ingeritance;

public class Commoner {
	protected int lv;
	protected String id;
	protected int hp;
	protected int mp;
	
	public Commoner(String id) {
		lv = 1;
		hp = 20;
		mp = 10;
		this.id = id;
	}
	
	public void getInfo() {

		System.out.println("아이디 : " + id + "\n레벨: " + lv + "\nhp : " + hp + "\nmp : " + mp );	
		System.out.println();
	}
}
