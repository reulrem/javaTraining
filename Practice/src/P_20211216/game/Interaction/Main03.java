package P_20211216.game.Interaction;

public class Main03 {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Archer a = new Archer();

		Troll tw = new Troll();
		Troll ta = new Troll();
		Orc ow = new Orc();
		Orc oa = new Orc();
		w.huntTroll(tw);
		w.huntTroll(tw);
		w.huntTroll(tw);
		w.huntOrc(ow);
		w.huntOrc(ow);
		w.huntOrc(ow);//<- 이 시점에서 마법사 사망
		w.huntOrc(ow);
		

		a.huntOrc(oa);
		a.huntOrc(oa);
		a.huntOrc(oa);
		a.huntOrc(oa);
		a.huntTroll(ta);
		a.huntTroll(ta);
		a.huntTroll(ta);
	}
}
