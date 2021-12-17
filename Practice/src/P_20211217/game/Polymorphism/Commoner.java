package P_20211217.game.Polymorphism;

public class Commoner {
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	public Commoner(String name,
			int hp,
			int mp,
			int atk) {
		this.name = name; 
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
	}
	
	public void hunting(Monster m) {
		
		if(hp <= 0) {
			System.out.println(name + "이(가) 사망한 상태입니다.");
			return;
		}
		if(m.getHp() <= 0) {
			System.out.println(m.getName() + "가 사망한 상태입니다.");
		}
		m.doBattle(atk);
		
		hp -= m.getHp();
		
		if(hp <= 0) {
			System.out.println(name + "이(가) 사망했습니다");
		}
	}
}
