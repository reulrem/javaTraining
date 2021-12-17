package P_20211206;

public class ForQ9P118 {
	public static void main(String[] args) {
		
		for(int i = 1; i <60 ; i ++) {
			for ( int j = 1 ; j < 60; j++) {
				if(i*4+j*5 == 60 ) {
					System.out.print("x = " + i);
					System.out.println( " y = " + j);
				}
			}
			
		}
	}
}
