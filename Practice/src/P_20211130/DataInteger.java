package P_20211130;

public class DataInteger {

	public static void main(String[] args) {
		// 정수형에는 크게 4개의 종류가 있습니다.
		// byte (1byte) short (2byte) int (4byte) long (4byte)

		byte a = 127; // 0 ~ 2^8-1
		short b = 32000; // 0 ~ 2^16-1
		int c = 21000000; // 0 ~ 2^32-1
		long d = 4611686018427387904L; // 0 ~ 2^64-1
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
