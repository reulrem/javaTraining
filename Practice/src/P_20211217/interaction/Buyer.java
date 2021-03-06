package P_20211217.interaction;

public class Buyer {
	
	private int money;
	private int apple;
	private int banana;
	
	public Buyer(){
		money = 800000;
	}

	public void buyApple(Seller s ,int apple) {
		if(money >= apple * s.getApplePrice()) {
			if(s.getApple() >= apple) {
				s.buyApple(apple);
				
				System.out.println("무사히 구매되었습니다.");
			}else {
				System.out.println("사과 재고가 부족합니다. 사과 재고 :" + s.getApple());
			}
		}else {
			System.out.println("돈이 모자랍니다.");
		}
		System.out.println();
		
	}
	
	public void buyBanana(Seller s ,int banana) {
		if(money >= banana * s.getBananaPrice()) {
			if(s.getBanana() >= banana) {
				s.buyBanana(banana);
				
				System.out.println("무사히 구매되었습니다.");
			}else {
				System.out.println("바나나 재고가 부족합니다. 바나나 재고 :" + s.getBanana());
			}
		}else {
			System.out.println("돈이 모자랍니다.");
		}
		System.out.println();
		
	}
}
