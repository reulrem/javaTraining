package P_20211222.exception02;

import java.util.Scanner;

public class IfElse01 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println(a/b);
	}
}
