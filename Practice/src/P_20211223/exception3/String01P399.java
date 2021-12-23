package P_20211223.exception3;

import java.util.Scanner;

public class String01P399 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		checking(sc);
		long end =System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start));

		sc.close();	
		}
	
	public static void checking(Scanner sc) {
		int a,b;

		while(true) {
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a/b);
				return;
			}catch (ArithmeticException e) {
				System.out.println("에러 : " + e);
				System.out.println("다시 입력하세요");
				sc.next();
			}catch(Exception e) {
				System.out.println("에러코드 : " + e);
				System.out.println("다시 입력하세요");
				sc.next();
			}
		}
	}
}
