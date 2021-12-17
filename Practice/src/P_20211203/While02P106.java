package P_20211203;

public class While02P106 {
	public static void main(String[] args) {
		int count = 0;
		while (true) {
			count++;
			System.out.println(count + "번째 반복문입니다.");
			
			if(count < 10) {
				break;
			}
		}
	}
	
}
