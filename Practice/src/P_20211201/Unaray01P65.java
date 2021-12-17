package P_20211201;

public class Unaray01P65 {
	public static void main(String[] args) {
		int a = 1;
		System.out.println(++a);
//		함수 안에 넣은 전위연산자 (++a) 를 먼저 계산하고 출력한다
		System.out.println(a);
		
		System.out.println(a++);
//		함수 안에 넣은 후위연산자 (++a) 는 출력을 진행한다
		System.out.println(a);
	}
}
