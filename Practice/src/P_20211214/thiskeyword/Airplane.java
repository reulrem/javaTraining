package P_20211214.thiskeyword;

public class Airplane {
	protected int speed;
	public Airplane(int speed) {
		
		if(speed> 900) {
			speed = 900;
		}
		this.speed = speed;
	}
	
	public void fly() {
		if(speed + 500 > 900) {
			speed = 900;
			System.out.println("현재 속력 : " + speed+ "km/s");
			return;
		}
		speed += 500;
		System.out.println("현재 속력 : " + speed+ "km/s");
	}
	
	public void breakSpeed() {
		if(speed - 100 < 0){
			speed = 0;
			System.out.println("현재 속력 : " + speed+ "km/s");
			return;
		}
		speed -= 100;
		System.out.println("현재 속력 : " + speed+ "km/s");
	}
	
	public void getInfo() {
		System.out.println(speed);
	}
}
