package P_20211214.Override;

public class Animal {
	
	String name;
	int age;
	double weight;
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 몸무게 : " + weight);	
	}
}
