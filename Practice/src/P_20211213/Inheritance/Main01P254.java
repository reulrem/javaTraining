package P_20211213.Inheritance;

public class Main01P254 {
	public static void main(String[] args) {
		Student s1 = new Student("김충남",25,"481834");
		s1.getInfo();
		s1.getStudentInfo();
		
		Salaryman s2 = new Salaryman("이철남",25,16000000);
		s2.getInfo();
		s2.getSalaryInfo();
	}
}
