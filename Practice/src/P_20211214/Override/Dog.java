package P_20211214.Override;

public class Dog extends Animal {
	
	String master;
	
	public Dog(String name, int age, double weight , String master) {
		super(name, age, weight);
		this.master = master;
	}
	
	public void howl() {
		System.out.println("멍!");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 몸무게 : " + weight + " 주인 : " + master);	
	}
}
