package P_20211221.interface1;

public class Car implements Vehicle{
	
	private int speed,gas;
	private String name;
	public Car(String name) {
		speed = 0;
		gas = MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		
		if(gas <= 0) {
			System.out.println("가스가 없습니다");
			return;
		}
		
		if(speed + 10 >= 200) {
			speed = 200;
			System.out.println("최대속력 도달");
		}
		else {
			speed += 10;
			gas -= 1;
		}
	}

	@Override
	public void breakSpeed() {
		// TODO Auto-generated method stub
		speed -= 10;
		if(speed < 0) {
			speed = 0;
		}
		
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub

		gas += 30;
		if(gas > MAX_GAS) {
			gas = MAX_GAS;
		}
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		System.out.println("기관 : " + name +
				"\n현재 속도 : " + speed +
				"\n현재 연료량 : " + gas);
		System.out.println();
	}

}
