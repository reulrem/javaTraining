package P_20211213.garbagecolletion;

public class Main01P201 {
	public static void main(String[] args) {
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		
		System.gc();
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		i4 = null;
		i1 = null;
		Item i6 = new Item(6);
		System.gc();
	}
}
