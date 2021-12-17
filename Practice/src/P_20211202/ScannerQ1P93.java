package P_20211202;
import java.util.Scanner;

public class ScannerQ1P93 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rate = 1177.6;
		int won ;
		
		System.out.println("금액을 입력해주세요.");
		
		won = sc.nextInt();
		
		
		System.out.println("현재 " + won + "원은 " + 
				Math.round( (won / rate) * 10 ) /10.0 + "달러입니다.");
		
		sc.close();
	}
}
