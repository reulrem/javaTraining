package structure;

public class Structure03P190 {
	
	public static void getInfo(Cat c) {
		System.out.println("나이 : "+c.age);
		System.out.println("이름 : "+c.name);
		System.out.println("털 색 : "+c.fur);
		}
	
	public static void main(String[] args) {
		Cat a = new Cat();
		Cat b = new Cat();

		
		a.age = 3;
		a.name = "나에";
		a.fur = "yellow";
		
		b.age = 1;
		b.name = "소닉";
		b.fur = "black";

		getInfo(a);
		getInfo(b);
	}
}
