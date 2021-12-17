package P_20211217.Polymorphism;

public class Person {
	private String name;
	private int age;
	private int grade;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void showPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
