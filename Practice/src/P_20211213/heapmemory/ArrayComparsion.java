package P_20211213.heapmemory;

public class ArrayComparsion {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = arr1;
		int [] arr3 = {1,2,3,4,5};
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
	}
}
