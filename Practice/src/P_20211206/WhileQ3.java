package P_20211206;

import java.util.Scanner;

public class WhileQ3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		while (i < num){
			int j = 0;
			while (j < num){
				j++;
				System.out.print("*");
			}
			i++;
			System.out.println();
		}
	}
}
