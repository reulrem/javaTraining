package P_20211201;

public class Binary03P75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5 = 00000000 00000000 00000000 00000101
//		3 = 00000000 00000000 00000000 00000011
//		&는 위아래가 1일 경우에 1
//		|는 한쪽이라도 1일 경우에 1
//		^는 위아래가 다를 경우 1

		System.out.println( 5 & 3 );
		
		System.out.println( 5 | 3 );
		
		
		System.out.println( 5 ^ 3 );
		
	}

}
