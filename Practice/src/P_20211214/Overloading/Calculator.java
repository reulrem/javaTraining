package P_20211214.Overloading;

public class Calculator {
	
	public int plus(int a, int b) {
		return a+b;
	}
	public double plus(double c) {
		return c + .5;
	}
	public void plus(String e) {
		System.out.println("String변수는 더할 수 없습니다");
	}
}
