package P_20211213.Inheritance;

public class Salaryman extends Person {
	
	private int salary;
	public Salaryman(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	

	public void getSalaryInfo() {

		System.out.println("이름은 "+ name + "입니다. "
				+ "나이는 " + age + "살 입니다. "
						+ "연봉은 " + salary + "입니다.");
	}

}
