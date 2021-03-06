package P_20211221.interface1;

public class Train implements Vehicle{
	
	private int speed,gas;
	private String name;
	public Train(String name) {
		speed = 0;
		gas = TRAIN_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		
		if(gas <= MIN_GAS) {
			System.out.println("가스가 없습니다");
			return;
		}
		
		if(speed + 50 >= TRAIN_MAX_SPEED) {
			speed = 200;
			System.out.println("최대속력 도달");
		}
		else {
			speed += 50;
			gas -= 7;
		}
	}

	@Override
	public void breakSpeed() {
		// TODO Auto-generated method stub
		speed -= 50;
		if(speed < MIN_SPEED) {
			speed = MIN_SPEED;
		}
		
	}

	@Override
	public void reFuel() {
		// TODO Auto-generated method stub

		gas += 70;
		if(gas > MAX_GAS) {
			gas = MAX_GAS;
		}
	}


	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		System.out.println("기관사 : " + name +
				"\n현재 속도 : " + speed +
				"\n현재 연료량 : " + gas);
		System.out.println();
	}

}
