package P_20211208;

public class Method06P204 {
	
	
	public static int add2 (int a) {
		return a;
	}

	public static void info() {
		System.out.println("안녕하세요");
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int a = add2(3);
		
		System.out.println(a);
		
		for(int i = 0 ; i < 3 ; i ++) {
			info();
		}
	}

}
