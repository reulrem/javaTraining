package P_20211214.Overloading;

public class Main {
	public static void main(String[] args) {
		Calculator cc = new Calculator();

		System.out.println(cc.plus(1,6));;
		System.out.println(cc.plus(5.5));;
		cc.plus("asdhg");
	}
}
