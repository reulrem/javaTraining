package P_20211203;

import java.util.Scanner;

public class For01P112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int a = sc.nextInt() ;
		for(int i =0 ; i< a ;i++) {
			System.out.println("for문으로 돌리는 반복문");
		}
	}
}
