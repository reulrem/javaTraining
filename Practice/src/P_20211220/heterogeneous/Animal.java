package P_20211220.heterogeneous;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {

		this.age = age;
		this.name = name;
	}
	
	public void sit() {
		System.out.println("앉아!");
	}
	
}
