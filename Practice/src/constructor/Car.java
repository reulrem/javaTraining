package constructor;

public class Car {
	public int gas;
	public int speed;
	public String owner;
	
    public void getInfo(){

		System.out.println(owner + "의 차 정보입니다.");
		System.out.println("연료양 : " + gas + ", 현재 속도 : " + speed );
		System.out.println();
    }

    public void AccelSpeed() {
    	gas -= 2;
    	speed += 10;
    }
    public void BreakSpeed() {
    	speed -= 10;    	
    }	
}
