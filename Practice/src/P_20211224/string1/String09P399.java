package P_20211224.string1;

public class String09P399 {
	public static void main(String[] args) {
		String a = "테스트";
		String b = "테스트";
		
		System.out.println(a == b);
		String c = new String("테스트");
		String d = new String("테스트");;

		System.out.println(c == d);
		
		System.out.println(c.equals(d));
	}
}
