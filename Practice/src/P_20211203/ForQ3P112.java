package P_20211203;

import java.util.Scanner;

public class ForQ3P112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		if (dan < 10 && dan > 1) {

			for(int i = 1;i<9;i++) {
				System.out.println(i + "x" + dan +"는" + i*dan + "입니다.");
				
			}
		}else {
			System.out.println("구구단의 유효범위는 2~9입니다.");
		}
	}
}
