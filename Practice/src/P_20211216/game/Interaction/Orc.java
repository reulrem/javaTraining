package P_20211216.game.Interaction;

public class Orc {
	private int hp;
	private int atk;
	private int def;

	public Orc() {
		hp = 20;
		atk = 4;
		def = 1;
	}
	
	public void doBattle(int uAtk) {
		
		hp = (hp + def) - uAtk;
		System.out.println("오크의 체력 : " + hp);
		
	}
	
	public boolean isOrcDead() {
		return hp <= 0;
	}

	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public int getDef() {
		return def;
	}
}
