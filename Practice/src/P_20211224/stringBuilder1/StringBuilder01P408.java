package P_20211224.stringBuilder1;

public class StringBuilder01P408 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abefg");
		sb.insert(2, "cd");
		System.out.println(sb);
	}
}
