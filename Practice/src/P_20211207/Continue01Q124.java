package P_20211207;

import java.util.Scanner;

public class Continue01Q124 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n ; i++) {
			if(i%2 == 0) {
				continue;
			}
			sum += i;
			System.out.println(sum);
		}	
		System.out.println(sum);
	}
	
}
