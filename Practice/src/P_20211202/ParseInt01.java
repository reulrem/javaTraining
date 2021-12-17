package P_20211202;

public class ParseInt01 {
	public static void main(String[] args) {
//		문자열을 정수로 바꾸고 싶을때
//		문자열이 정수로만 이루어졌을 경우 사용하는 문법이 있습니다.
		
		String str = "20211202";
		int date = Integer.parseInt(str);
		System.out.println(date + 1);
		System.out.println(str + 16);
	}
}
