package P_20211224.stringBuilder1;

public class StringBuilder03P408 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("asdf");
		sb.delete( 1,1);
		sb.deleteCharAt(3);
		System.out.println(sb);
	}
}
