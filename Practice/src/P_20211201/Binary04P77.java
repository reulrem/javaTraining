package P_20211201;

public class Binary04P77 {

	public static void main(String[] args) {
		// 비트 이동 연산자 >>,<<
		// 꺽쇠방향에 따라 2진법 기준으로 자리수가 이동합니다.
		// <<는 왼쪽방향, 그러니까 2의 제곱만큼 늘어납니다.
		// >>는 2의 제곱만큼 줄어듭니다.
		
		int a = 80;
		System.out.println( a >> 3);
		
		System.out.println( a << 3);
	}

}
