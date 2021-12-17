package P_20211215.game.accessmodifier;

public class Magician extends Commoner{
	
	void hunt() {
		System.out.println("마법사가 사냥을 시작");
		getInfo();
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	
	void fireball() {
		System.out.println("마법사가 파이어볼을 시전");
		setHp(getMp()-3);
		setExp(getExp()+20);
	}
	
	void heal() {
		System.out.println("마법사가 힐을 시전");
		setMp(getMp()-2);
		setHp(getHp()+10);
	}
	
	public void getInfo() {

		System.out.println("레벨: " + getLv() + 
				"\nhp : " + getHp() + 
				"\nmp : " + getMp() + 
				"\nEXP : " + getExp());	
		System.out.println();
	}

}
