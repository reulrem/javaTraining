package P_20211222.exception02;

import java.util.Scanner;

public class TryCatch01P353 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				Thread.sleep(8000);
				System.out.println("에러1");
				a = sc.nextInt();
				System.out.println("에러2");
				b = sc.nextInt();
				System.out.println("에러3");
				System.out.println(a/b);
				System.out.println("에러4");
				break;
			}catch (ArithmeticException e) {
				System.out.println("에러 : " + e);
				System.out.println("다시 입력하세요");
			}catch(Exception e) {
				System.out.println("에러코드 : " + e);
				System.out.println("다시 입력하세요");
				continue;
			}
		}
		System.out.println("무한루프 깨짐");
		sc.close();
	}
}
