package P_20211213.accessmodifier;

public class Warrior {
	private String name;
	private int hp;
	private int mp;
	private int lv;
	private int atk;
	private int def;
	private int exp;
	public Warrior(String name) {
		this.name = name;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
	}
	
	public void hunt () {
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력이 " + hp + "가 되었고 누적 경험치가 " + exp + "가 되었습니다.");
	}
}
