package structure;

public class Structure01P190 {
	public static void main(String[] args) {
		Person p = new Person();
		p.age = 23;
		p.name = "박건";
		p.P_num = "01056116476";
		p.uNum = 990816;
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.P_num);
		System.out.println(p.uNum);
		System.out.println();

		Person p2 = new Person();
		p2.age = 24;
		p2.name = "박";
		p2.P_num = "11056116476";
		p2.uNum = 990815;
		System.out.println(p2.age);
		System.out.println(p2.name);
		System.out.println(p2.P_num);
		System.out.println(p2.uNum);
	}
}
