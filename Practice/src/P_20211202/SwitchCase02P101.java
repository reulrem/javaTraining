package P_20211202;

public class SwitchCase02P101 {
	public static void main(String[] args) {
		
		int score = 1 ;
		
		switch (score) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
		case 7:
			System.out.println("우");
			break;
		case 6:
		case 5:
			System.out.println("미");
			break;
		case 4:
		case 3:
			System.out.println("양");
			break;
		default :
			System.out.println("가");
		}
		
	}
}
