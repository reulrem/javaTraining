package structure;

public class Structure02P190 {
	
	public static void getInfo(Person p) {
		System.out.println("나이 : "+p.age);
		System.out.println("이름 : "+p.name);
		System.out.println("전화번호 : "+p.P_num);
		System.out.println("유저번호 : "+p.uNum);
	}
	
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();

		
		a.age = 28;
		a.name = "박건";
		a.P_num = "01056116476";
		a.uNum = 183483288;
		
		b.age = 28;
		b.name = "박건";
		b.P_num = "01056116476";
		b.uNum = 183483288;

		getInfo(a);
		getInfo(b);
	}
}
