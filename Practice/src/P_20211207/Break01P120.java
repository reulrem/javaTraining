package P_20211207;

import java.util.Scanner;

public class Break01P120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = 0;
		int count = sc.nextInt();
		System.out.println("입력");
		while (true) {
			if(sum > count) {
				break;
			}
			a ++;
			sum += a;
			System.out.println(sum);
		}
		
		System.out.println(sum+"까지 더해졌습니다");
		
		System.out.println(a+"부터 초과됩니다.");
		
	}

}
