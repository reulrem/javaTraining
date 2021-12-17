package P_20211215.game.accessmodifier;

public class Warrior extends Commoner{
	
	void hunt() {
		System.out.println("전사가 사냥을 시작");
		setHp(getHp()-2);
		setExp(getExp()+10);
		getInfo();
		System.out.println();
	}
	
	void doubleAttack() {
		System.out.println("전사가 더블어택을 사용");
		setHp(getHp()-4);
		setExp(getExp()+25);
		getInfo();
		System.out.println();
	}
	
	public void getInfo() {

		System.out.println("레벨: " + getLv() + 
				"\nhp : " + getHp() + 
				"\nmp : " + getMp() + 
				"\nEXP : " + getExp());	
		System.out.println();
	}

}
