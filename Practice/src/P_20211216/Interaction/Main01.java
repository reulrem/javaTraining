package P_20211216.Interaction;

public class Main01 {
	public static void main(String[] args) {

		Seller s1 = new Seller(47);
		Seller s2 = new Seller(89);		Buyer b = new Buyer();
		
		b.buyMango(s2, 47);
		s1.getSellerInfo();
	}
}
