package P_20211214.Override;

public class Lion extends Animal{

	int child;
	
	public Lion(String name, int age, double weight, int child) {
		super(name, age, weight);
		this.child = child;
	}
	public void howl() {
		System.out.println("어흥!");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 몸무게 : " + weight + " 자식 : " + child);	
	}
}