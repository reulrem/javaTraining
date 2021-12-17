package P_20211202;

import java.util.Scanner;

public class ElseIfQ1P97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력해주세요");
		
		int score = sc.nextInt();
		if(score >= 95) {
			System.out.println("A+");
		}	
		else if(score >= 90) {
			System.out.println("A0");
		}	
		else if(score >= 85) {
			System.out.println("B+");
		}	
		else if(score >= 80) {
			System.out.println("B0");
		}	
		else if(score >= 75) {
			System.out.println("C+");
		}	
		else if(score >= 70) {
			System.out.println("C0");
		}	
		else if(score >= 65) {
			System.out.println("D+");
		}	
		else if(score >= 60) {
			System.out.println("D0");
		}	
		else {
			System.out.println("F");
		}	
	}
}
