package P_20211228.Random;

import java.util.Calendar;
import java.util.Random;

public class Random03P484 {
	public static void main(String[] args) {
		Random r = new Random();
		int randomInt = r.nextInt();
		int randomIntBound = r.nextInt(10) +1;
		System.out.println(randomInt);
		System.out.println(randomIntBound);
	}
}
