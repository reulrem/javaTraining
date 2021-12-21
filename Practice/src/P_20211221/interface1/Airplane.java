package P_20211221.interface1;

public class Airplane implements Vehicle{
	
	private int speed,gas;
	private String name;
	public Airplane(String name) {
		speed = MIN_GAS;
		gas = AIRPLANE_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		
		if(gas <= MIN_GAS) {
			System.out.println("가스가 없습니다");
			return;
		}
		
		if(speed + 50 >= AIRPLANE_MAX_SPEED) {
			speed = AIRPLANE_MAX_SPEED;
			System.out.println("최대속력 도달");
		}
		else {
			speed += AIRPLANE_ACCEL_SPEED;
			gas -= AIRPLANE_ACCEL_GAS;
		}
	}

	@Override
	public void breakSpeed() {
		// TODO Auto-generated method stub
		speed -= AIRPLANE_BREAK_SPEED;
		if(speed < MIN_SPEED) {
			speed = MIN_SPEED;
		}
		
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub

		gas += AIRPLANE_RE_FUEL;
		if(gas > MAX_GAS) {
			gas = MAX_GAS;
		}
	}


	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		System.out.println("기관장 : " + name +
				"\n현재 속도 : " + speed +
				"\n현재 연료량 : " + gas);
		System.out.println();
	}

}
