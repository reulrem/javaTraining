package P_20211217.Polymorphism;

public class Salaryman extends Person {
	
	private int money;
	
	public Salaryman(String name, int age, int money) {
		super(name,age);
		this.money = money;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("월급 : " + money);
	}
}
