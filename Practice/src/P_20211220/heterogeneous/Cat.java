package P_20211220.heterogeneous;

public class Cat extends Animal {
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void sit() {
		System.out.println("고양이가 앉습니다");
	}
	
	public void jump() {
		System.out.println("고양이가 뜁니다");
	}
}
