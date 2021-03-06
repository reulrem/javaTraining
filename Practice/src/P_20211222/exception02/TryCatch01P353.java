package P_20211222.exception02;

import java.util.Scanner;

public class TryCatch01P353 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a/b);
				break;
			}catch (ArithmeticException e) {
				System.out.println("에러 : " + e);
				System.out.println("다시 입력하세요");
			}catch(Exception e) {
				System.out.println("에러코드 : " + e);
				System.out.println("다시 입력하세요");
			}finally {
				sc.next();
			}
		}
		System.out.println("무한루프 깨짐");
		sc.close();
	}
}
