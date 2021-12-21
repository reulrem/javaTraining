package P_20211221.abstract1;

public class Child extends Parent{
	
	@Override
	public void getAge() {
		System.out.println("부모의 나이는 접근불가");
	}
}
