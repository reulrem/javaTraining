package P_20211217.game.Polymorphism;

public class Main {
	public static void main(String[] args) {
		Commoner c = new Commoner("남식이", 100, 10, 0100);
		Orc o = new Orc();
		Goblin g = new Goblin();
		Slime s = new Slime();
		bat b = new bat();

		c.hunting(o);
		c.hunting(g);
		c.hunting(s);
		c.hunting(b);
	}
}
