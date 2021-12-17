package P_20211217.interaction;

public class Seller {
	private int apple;
	private int banana;
	private int money;
	private int a_Price;
	private int b_Price;
	
	public Seller(int apple, int banana) {
		
		this.apple = apple;
		this.banana = banana;
		money = 0;
		a_Price = 500;
		b_Price = 1000;
	}

	public void buyApple(int apple) {
		
		if(this.apple < apple) {
			System.out.println("사과 재고가 부족합니다.");
		}else {
			this.apple -= apple;
			money += a_Price * apple;
		}
		
	}
	
	public void buyBanana(int banana) {

		if(this.banana < banana) {
			System.out.println("바나나 재고가 부족합니다.");
		}else {
			this.banana -= banana;
			money += b_Price * banana;
		}
		
	}
	

	
	public void getSellerInfo(){
		System.out.println("매출 : " + money);
		System.out.println("사과 재고 : " + apple);
		System.out.println("바나나 재고 : " + banana);
	}
	
	public int getApple () {
		return apple;
	}
	
	public int getBanana () {
		return banana;
	}

	public int getBananaPrice() {
		return b_Price;
	}

	public int getApplePrice() {
		return a_Price;
	}
	
}
