package P_20211227.arrays1;

import java.util.Arrays;

public class Arrays02 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] arr= Arrays.copyOf(a, 3);
		System.out.println(a);
		System.out.println(arr);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int[] arr2 = Arrays.copyOf(a, 10);
		for(int b : arr2) {
			System.out.println(b);
		}
	}
}
