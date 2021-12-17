package P_20211201;

public class AndOr02P72 {

	public static void main(String[] args) {

//		&& , || 는 short circuit라고 부릅니다.
//		& ,  |  와 같이 작동하지만 조건식이 하나라도 만족하면 뒤의 연산자는 처리하지 않습니다.
//		0으로 정수를 나누면 오류가 나지만 왼쪽 계산식이 맞는경우 처리하지 않습니다.
		System.out.println( ( 3 + 1 < 4 ) && ( 0 < 3 / 0 )  );
		System.out.println( ( 3 < 4 ) || ( 0 < 13 / 0 ) );
		
	}

}
