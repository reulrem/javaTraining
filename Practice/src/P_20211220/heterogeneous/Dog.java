package P_20211220.heterogeneous;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void sit() {
		System.out.println("개가 앉습니다");
	}
	
	public void run() {
		System.out.println("개가 뛰놉니다");
	}
}
