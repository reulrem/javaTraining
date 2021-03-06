package P_20211221.interface1;

public interface Vehicle {
	

	int MAX_GAS = 100;
	int TRAIN_MAX_GAS = 300;
	int TRAIN_BREAK_SPEED = 50;
	int TRAIN_ACCEL_SPEED = 50;
	int TRAIN_MAX_SPEED = 300;
	int TRAIN_ACCEL_GAS = 7;
	int TRAIN_RE_FUEL = 10;

	int CAR_ACCEL_SPEED = 10;
	int CAR_MAX_GAS = 100;
	int CAR_BREAK_SPEED = 10;
	int CAR_MAX_SPEED = 100;
	int CAR_ACCEL_GAS = 1;
	int CAR_RE_FUEL = 10;

	int AIRPLANE_MAX_GAS = 1000;
	int AIRPLANE_ACCEL_SPEED = 400;
	int AIRPLANE_BREAK_SPEED = 300;
	int AIRPLANE_MAX_SPEED = 900;
	int AIRPLANE_ACCEL_GAS = 150;
	int AIRPLANE_RE_FUEL = 500;
	
	int MIN_SPEED = 0;
	int MIN_GAS = 0;


	public void accel();
	public void breakSpeed();
	public void reFuel();
	public void showStatus();

}
