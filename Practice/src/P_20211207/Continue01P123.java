package P_20211207;

public class Continue01P123 {
	public static void main(String[] args) {
			for (int i = 0; i < 10 ; i++) {
				if(i == 6 || i == 8) {
					System.out.println("출력무시");
					continue;
				}
				System.out.println(i);
			}
	}
	
}
