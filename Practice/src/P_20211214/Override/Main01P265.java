package P_20211214.Override;

public class Main01P265 {
	public static void main(String[] args) {
		Lion l = new Lion ("사랑이",6,121.3,2);
		l.howl();
		
		Dog d = new Dog ("도식이",17,5.3,"곽현서");
		d.howl();
		

		l.getInfo();
		d.getInfo();
	}
}
