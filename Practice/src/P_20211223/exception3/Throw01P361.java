package P_20211223.exception3;

public class Throw01P361 {
	public static void main(String[] args) {
		String [] s = {"hi","안녕","おはよ","ごんばんわ"};
		int i = (int)(Math.random() * 5
				
				);
		try {
			doIt(s,i);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("범위 밖");
		}
	}
	
	public static void doIt(String[] s, int i) 
			throws ArrayIndexOutOfBoundsException{
		System.out.println(s[i]);
	}
}
