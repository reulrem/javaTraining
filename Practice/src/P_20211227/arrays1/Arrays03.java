package P_20211227.arrays1;

import java.util.Arrays;

public class Arrays03 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int [] arrCopy = Arrays.copyOfRange(a, 3, 7);
		System.out.println(Arrays.toString(arrCopy));
		
		int [] arrCopyOver = Arrays.copyOfRange(a , 4	,20);
		System.out.println(Arrays.toString(arrCopyOver));
		
	}
}
