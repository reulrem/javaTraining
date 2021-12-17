package P_20211206;

public class Break02P120 {
	public static void main(String[] args) {
		for(int i = 2 ; i < 10; i++) {
			for(int j = 1 ; j < 10; j++) {
				if(j > 4) {
					System.out.println("5단 생략");
					break;
				}
				System.out.println( i + "*" + j + "=" +i*j);
			}
			System.out.println();
		}
	}
}