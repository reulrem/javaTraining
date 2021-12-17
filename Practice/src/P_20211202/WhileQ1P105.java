package P_20211202;

import java.util.Scanner;

public class WhileQ1P105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("반복될 횟수 입력");
		String num = sc.nextLine();
		int loop = Integer.parseInt(num);
		while (loop > 0 ) {
			loop--;
			System.out.println("반복문을 실행합니다.");
		}
		System.out.println("\n반복문을 종료합니다.");
		sc.close();
		
	}
}
