package P_20211220.static1;

public class StaticTest {
	public int n1;
	public static int n2 = 0;
	
	public StaticTest() {
		this.n1 = 5;
		n2++;
		System.out.println("n1 변수 : " +  n1);
		System.out.println("n2 변수 : " +  n2);
	}
	
	public static void check() {
		n2 += 1;
		System.out.println("공용 메서드 호출");
	}
}
