package P_20211217.Polymorphism;

public class Main02 {
	public static void main(String[] args) {
		Person [] people = new Person[3];
		people[0] = new Student("김학생", 17, 1);
		people[1] = new Salaryman("김직원", 27, 1800000);
		people[2] = new Boss("김보스", 37, 1);
		
		
		for(Person p : people) {
			p.showPerson();
			System.out.println();
		}
	}
}
