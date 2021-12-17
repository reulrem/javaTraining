package P_20211201;

public class Overflow {
	public static void main(String[] args) {
		byte a = 127;
		byte b = 1;
		System.out.println((byte)(a + b));
	}
}
