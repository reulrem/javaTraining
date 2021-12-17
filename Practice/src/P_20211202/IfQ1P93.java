package P_20211202;
import java.util.Scanner;

public class IfQ1P93 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a ;
		
		System.out.println("정수를 입력해주세요.");
		a = sc.nextInt();
		
		if(a >= 0) {
			System.out.println("입력된 수는");
			System.out.println("0보다 크거나 같습니다.");
		}
		else {
			System.out.println("입력된 수는");
			System.out.println("0보다 작습니다.");
		}
	}
}
