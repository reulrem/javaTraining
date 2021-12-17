package P_20211215.game.Ingeritance;

public class Main02 {
	public static void main(String[] args) {
		Commoner c = new Commoner("xkfkrvkdnjwjstk");
		c.getInfo();
		
		Warrior w = new Warrior("warrior");
		w.getInfo();
		
		Magician m = new Magician("magician");
		m.getInfo();
		
		Archer a = new Archer("archer");
		a.getInfo();
	}
}
