package P_20211203;

import java.util.Scanner;

public class Dowhile02P109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order;
		System.out.println("주문금액을 입력해주세요.");
		order  = sc.nextInt();
		do {
			System.out.println("배달을 완료했습니다.");
			System.out.println("다음 주문금액을 입력해주세요.");
			order  = sc.nextInt();
			
		}while(order > 15000);
		System.out.println("금액이 모자라 배달이 종료되었습니다.");
	}
}
