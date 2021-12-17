package P_20211216.Interaction;

public class Seller {
	
	private int money;
	private int mango;
	
	public Seller(int mango) {
		money = 0;
		this.mango = mango;
	}
	
	public void SellMango(int mango) {
		if(this.mango < mango ) {
			System.out.println("망고가 모자람");
			return ;
		}
		this.mango -= mango;
		money += mango * 3000;
		return ;
	} 
	
	public void getSellerInfo(){
		System.out.println("매출 : " + money);
		System.out.println("재고 : " + mango);
	}
	
	public void setMango (int mango) {
		this.mango = mango;
	}
	
	public int getMango () {
		return mango;
	}
	
	
}
