package P_20211217.game.Polymorphism;

public class Monster {

	private String name;
	private int hp;
	private int mp;
	private int atk;
	

	public Monster(String name,
			int hp,
			int mp,
			int atk) {
		
		this.name = name; 
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
	}
	
	public void doBattle(int atk) {
		if(hp <=0) {
			System.out.println(name +"이(가) 사망했습니다");
			return;
		}
		hp = (hp)-atk;
		
		System.out.println(name +"의 체력 : " + hp);
		if(hp <=0) {
			System.out.println(name +"이(가) 사망했습니다");
		}
	}

	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
