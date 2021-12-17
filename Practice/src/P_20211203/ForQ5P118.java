package P_20211203;

import java.util.Scanner;

public class ForQ5P118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =  0; i <num ; i++) {
			for(int j = 0 ; j <num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
