package P_20211216.game.Interaction;

public class Main04 {
	public static void main(String[] args) {
		Warrior wa = new Warrior();
		Wizard wi = new Wizard();
		Archer a = new Archer();

		Slime swa = new Slime();
		Slime swi = new Slime();
		Slime sa = new Slime();
		wa.huntSlime(swa);
		wi.huntSlime(swi);
		a.huntSlime(sa);
	}
}
