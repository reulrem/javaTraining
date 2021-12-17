package P_20211217.Polymorphism;

public class Student extends Person {
	
	private int grade;
	
	public Student(String name, int age, int grade) {
		super(name,age);
		this.grade = grade;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("학년 : " + grade);
	}
}
