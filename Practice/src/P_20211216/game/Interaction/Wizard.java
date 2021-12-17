package P_20211216.game.Interaction;

public class Wizard {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;

	public Wizard() {
		hp = 20;
		mp = 10;
		atk = 4;
		def = 1;
		exp = 0;
	}
	
	public void huntOrc(Orc o) {
		
		if(o.isOrcDead()) {
			System.out.println("트롤이 죽었습니다");
			return;
		}
		
		if(isWarriorDead()) {
			System.out.println("캐릭터가 사망했습니다.");
			return;
		}
		
		o.doBattle(atk);
		hp = hp + def - o.getAtk();
		System.out.println("마법사의 남은 체력 : " + hp);

		if(isWarriorDead()) {
			System.out.println("캐릭터가 사망했습니다.");
		}
	}
	
	public void huntSlime(Slime s) {
		if(s.isSlimeDead()) {
			System.out.println("슬라임이 죽었습니다");
			return;
		}
		
		if(isWarriorDead()) {
			return;
		}
		
		s.doBattle(atk);
		hp = hp + def - s.getAtk();
		System.out.println("마법사의 남은 체력 : " + hp);

		if(isWarriorDead()) {
			System.out.println("캐릭터가 사망했습니다.");
		}
		System.out.println();
	}


	
	public void huntTroll(Troll t) {

		if(t.isTrollDead()) {
			System.out.println("트롤이 죽었습니다");
			return;
		}
		
		if(isWarriorDead()) {
			System.out.println("캐릭터가 사망했습니다.");
			return;
		}
		
		t.doBattle(atk);
		hp = hp + def - t.getAtk();
		System.out.println("마법사의 남은 체력 : " + hp);
		if(isWarriorDead()) {
			System.out.println("캐릭터가 사망했습니다.");
		}
	}
	
	public boolean isWarriorDead() {
		return hp <= 0;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getMp() {
		return mp;
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
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getExp() {
		return exp;
	}
	
}
