package P_20211220.heterogeneous;

public class Main02 {
	public static void main(String[] args) {
		Animal a = new Animal("동물", 6);
		Animal c = new Cat("갈매기", 1);
		Animal d = new Dog("개", 5);

		a.sit();
		c.sit();
		d.sit();
		
//		d.run(); //Dog 생성자를 Animal에 넣었지만 결국 Animal 변수로 저장되었으므로
//		Animal에 있는 변수, 메소드만 사용할 수 있다.
		
		Dog dog =(Dog)d;
		dog.run();
	}
}
