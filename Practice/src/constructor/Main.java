package constructor;

import structure.PersonClass;

public class Main {
	public static void main(String[] args) {

		Car c = new Car();
		c.gas = 100;
		c.owner = "박건";
		
		c.getInfo();
		
		c.AccelSpeed();
		c.getInfo();
		
		c.AccelSpeed();
		c.getInfo();
		
		c.BreakSpeed();
		c.getInfo();
		
		
		c.BreakSpeed();
		
		
		
		c.getInfo();
		
	}
}
