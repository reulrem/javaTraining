package P_20211227.arrays1;

import java.util.Arrays;

public class Arrays01 {
	public static void main(String[] args) {
		int [] a = {5,1,6,78,1,3,8,4};
		
		
		int b = Arrays.binarySearch(a,78);
		System.out.println(b);
		int [] c = {0,2,6,8,15,34,81,411};
		
		int d = Arrays.binarySearch(c, 0);
				System.out.println(d);
	}
}
