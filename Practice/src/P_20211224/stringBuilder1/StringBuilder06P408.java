package P_20211224.stringBuilder1;

public class StringBuilder06P408 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("아야어여오요우유");
		String korean = sb.toString();
		StringBuilder str2 = new StringBuilder(korean);
		System.out.println(str2);
	}
}
