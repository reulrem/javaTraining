package P_20211215.game.accessmodifier;


public class Commoner {
	private int lv;
	private int hp;
	private int mp;
	private int exp;
	private String name;
	
	public Commoner() {
		lv = 1;
		hp = 20;
		mp = 10;
		exp = 0;
		name = "마법사";
	}
	
	public void getInfo() {

		System.out.println("레벨: " + lv + "\nhp : " + hp + "\nmp : " + mp );	
		System.out.println();
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
