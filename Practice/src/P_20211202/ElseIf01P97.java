package P_20211202;

import java.util.Scanner;

public class ElseIf01P97 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("정수를 입력해주세요");
		int a = sc.nextInt();

		if(a > 0) {System.out.println("양수입니다.");}

		else if(a == 0) {System.out.println("0입니다.");}

		else {System.out.println("음수입니다.");}
		
	}

}
