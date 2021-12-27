package P_20211227.Math;

public class Math04 {
	public static void main(String[] args) {
		double a = Math.random();
		System.out.println(a);
		
		if(a > 0.5) {
			System.out.println("강화 성공");
		}else {
			System.out.println("강화 실패");
		}
	}
}
