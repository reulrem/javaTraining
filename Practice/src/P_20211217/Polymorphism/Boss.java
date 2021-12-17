package P_20211217.Polymorphism;

public class Boss extends Person {
	
	private int employee;
	
	public Boss(String name, int age, int employee) {
		super(name,age);
		this.employee = employee;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("직원 수 : " + employee);
		System.out.println();
	}
}
