package P_20211206;

public class Break01P120 {
	public static void main(String[] args) {
		int a= 5;
		int [] arr = {9,8,7,6,5,2,4,3,1};
		for (int aa : arr) {
			if(aa == a) {
				System.out.println("1이 나옴");
				break;
			}
			System.out.println(aa);
		}
	}
}
