package P_20211217.interaction;

public class Main01 {
	public static void main(String[] args) {
		Seller s1 = new Seller(5, 8);
		Seller s2 = new Seller(52, 18);
		Buyer b = new Buyer();

		b.buyBanana(s1, 10);
		b.buyApple(s2, 1);
	}
}
