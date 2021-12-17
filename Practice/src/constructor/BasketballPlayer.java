package constructor;

public class BasketballPlayer {
	
	double height;
	double jump;
	public BasketballPlayer(double height, double jump) {
		this.height = height;
		this.jump = jump;

		System.out.println("생성된 선수 키 : " + height);
		System.out.println("생성된 선수 점프력 : " + jump);
	}
	
	
	public void dunkShoot(){
		if(height + jump > 300) {
			System.out.println("덩크슛 성공");
		}else {
			System.out.println("덩크슛 실패");
		}
	}
}
