package structure;

public class ClassMain02P196 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();

		c1.model = "K55A1";
		c1.price = 1999900000;
		c1.owner = "김대한";

		c2.model = "K9";
		c2.price = 900000000;
		c2.owner = "조재흥";

		c1.getInfo();
		c2.getInfo();
	}
}
