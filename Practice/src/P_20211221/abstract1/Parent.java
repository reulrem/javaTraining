package P_20211221.abstract1;

public abstract class Parent{
	private int age;
	public Parent() {
		age = 40;
	}
	
	public abstract void getAge();
	
	public void getInfo() {
		System.out.println("일반메서드");
	}
};
