package P_20211214.thiskeyword;

public class Person {
	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name,int age,int money,String major) {

		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	
	public void getInfo(){

		System.out.println("이름 : " + name + "\n나이 : " + age + "\n소지금액 : " + money + "\n전공 : " + major +"\n");	
		
	}
}
