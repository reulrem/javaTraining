package P_20211224.stringBuilder1;

public class StringBuilder05P408 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklnmopqrstuvwxyz");
		
		for(int i = sb.length(); i > 0 ; i--) {
			if((i) % 3 == 0) {
				sb.deleteCharAt(i-1);
			}
		
		}
		
		System.out.println(sb);
	}
}
