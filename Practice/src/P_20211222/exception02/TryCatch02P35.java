package P_20211222.exception02;


public class TryCatch02P35 {
	public static void main(String[] args) {
		String st = "asg";
		Object i = 1;
		try {
			st = (String)i;
			System.out.println(st);
		}catch(Exception e) {
			System.out.println("잘못된 형변환입니다.");
		}
	}
}
