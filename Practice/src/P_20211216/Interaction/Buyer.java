package P_20211216.Interaction;

public class Buyer {
	
	private int money;
	
	public Buyer(){
		money = 800000;
	}
	
	public void buyMango(Seller s ,int mango) {
		if(money >= mango * 8000) {
			if(s.getMango() >= mango) {
				s.SellMango(mango);
				System.out.println("무사히 구매되었습니다.");
			}else {
				System.out.println("망고 재고가 부족합니다. 망고 재고 :" + s.getMango());
			}
		}else {
			System.out.println("돈이 모자랍니다.");
		}
		System.out.println();
		
	}
}
