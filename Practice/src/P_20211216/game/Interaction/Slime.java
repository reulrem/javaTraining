package P_20211216.game.Interaction;

public class Slime {
	private int hp;
	private int atk;
	private int def;

	public Slime() {
		hp = 40;
		atk = 5;
		def = 3;
	}
	
	public void doBattle(int uAtk) {
		
		hp = (hp + def) - uAtk;
		
		System.out.println("슬라임의 남은 체력 : " + hp);

		
	}
	
	public boolean isSlimeDead() {
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
