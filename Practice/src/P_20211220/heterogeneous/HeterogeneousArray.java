package P_20211220.heterogeneous;

public class HeterogeneousArray {
	public static void main(String[] args) {
		int[] iArr = {1,2,3,4,5,6,8,4,5,9,4,2,6};
		
		
		for(int i : iArr) {
			System.out.println(i);
		}
		System.out.println();
		
		Object[] oArray = {"A",'a',5,5,0.9,51,"h",6};
		for(Object o : oArray) {
			System.out.println(o);
		}
	}
}
