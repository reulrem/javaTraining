package P_20211214.thiskeyword;

public class SupersonicAirplane extends Airplane {
	
	public SupersonicAirplane(int speed) {

		super(speed);
		System.out.println("초음속 비행기의 속도는 " + speed+ "km/s입니다");
	}
	
	public void fly() {
		if(speed <= 400) {

			super.fly();
		}else if(speed + 500 > 1300) {
			speed = 1300;
		}else {
			speed +=500;
		}
		System.out.println("현재 속력 : " + speed+ "km/s");
	}
	
	public void breakSpeed() {
		
		if(speed - 100 < 0){
			speed = 0;
			return;
		}
		speed -= 100;
		System.out.println("현재 속력 : " + speed+ "km/s");
	}
	
	public void getInfo() {
		System.out.println(speed);
	}
}
