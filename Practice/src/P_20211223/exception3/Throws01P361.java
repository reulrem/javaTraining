package P_20211223.exception3;

public class Throws01P361 {
	public static void main(String[] args) {
		int ran = (int)(Math.random() * 10);
		
		try {
			if(ran > 3) {throw new ArrayIndexOutOfBoundsException();}
			System.out.println("정상범위");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위 초과");
		}catch(Exception e) {
			
		}
	}
}
