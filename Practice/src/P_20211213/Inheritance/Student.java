package P_20211213.Inheritance;

public class Student extends Person{
	
	String S_num;

	public Student(String name, int age, String S_num) {
		super(name, age);
		this.S_num = S_num;
	}
	
	public void getStudentInfo() {

		System.out.println("이름은 "+ name + "입니다. 나이는 " + age + "살 입니다. 학번은 " + S_num + "입니다.");
	}

}
