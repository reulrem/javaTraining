package P_20211223.exception3;

public class String02P399 {
	public static void main(String[] args) {
		String tom = "tomato";
		int get = tom.indexOf("to");
		System.out.println(get);
		
		get = tom.indexOf("to",1);
		System.out.println(get);
		
		String banana = "banana";
		get = tom.indexOf(banana);
		System.out.println(get);
		
	}
}
