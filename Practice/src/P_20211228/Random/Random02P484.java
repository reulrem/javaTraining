package P_20211228.Random;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("던질 횟수를 정해주세요");
		long getSca = sc.nextLong();
		int front = 0;
		int back = 0;
		for(long l = 0L; l < getSca ; l++) {
			if(r.nextBoolean()) {
				front++;
			}else {
				back++;
			}
		}
		
		System.out.println("앞면 : " + front + "회");
		System.out.println("뒷면 : " + back + "회");
		sc.close();
	}
}
