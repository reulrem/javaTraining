package P_20211214.Overloading;

public class PartTimer {

	private int pay;

	private boolean noon;

	private String shopName;

	private String name;
	
	public PartTimer(int pay, boolean noon,String shopName,String name) {
		
		if(pay < 8750) {
			pay = 8750;
		}
		
		this.pay = pay;

		this.noon = noon;

		this.shopName = shopName;

		this.name = name;
		
		System.out.println("알바가 고용되었습니다");
		
		System.out.println("시급 : " + pay);
		
		System.out.println("시간 : " + (noon?"오전":"오후"));
		
		System.out.println("지점명 : " + shopName);
		
		System.out.println("이름 : " + name);
		
		System.out.println();
		
	}
	
	public PartTimer( boolean noon, String shopName,String name) {
		
		this.pay = 8750;

		this.noon = noon;

		this.shopName = shopName;

		this.name = name;
		
		System.out.println("알바가 고용되었습니다");
		
		System.out.println("시급 : " + pay);
		
		System.out.println("시간 : " + (noon?"오전":"오후"));
		
		System.out.println("지점명 : " + shopName);
		
		System.out.println("이름 : " + name);
		
		System.out.println();
		
		
	}

	
}
