package P_20211210;

import constructor.BasketballPlayer;

public class Main02OP204 {
	public static void main(String[] args) {
		BasketballPlayer bp1 = new BasketballPlayer(180, 110);
		BasketballPlayer bp2 = new BasketballPlayer(180, 200);
		
		bp1.dunkShoot();
		bp2.dunkShoot();
	}
}
