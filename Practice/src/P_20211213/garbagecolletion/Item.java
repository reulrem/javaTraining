package P_20211213.garbagecolletion;

public class Item {
	public int num;
	
	public Item(int num) {
		this.num = num;
		System.out.println(this.num + "번 객체 생성 완료");
	}

	protected void finalize() {
		System.out.println(this.num + "객체 소멸");
	}
}
