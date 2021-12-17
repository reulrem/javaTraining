package P_20211203;

import java.util.Scanner;

public class WhileQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i =0;
		int j = 0;
		while ( i <= num) {
			i++;
			while ( j <= num){
				j++;
				System.out.print("*");
			}
			j = 0;
			System.out.println();
		}
	}
	
}
