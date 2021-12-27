package P_20211227.Math;

public class Math06 {
	public static void main(String[] args) {
		int comValue = (int)(Math.random()*3);
		int myValue =(int)(Math.random()*3);

		if(comValue == myValue) {
			System.out.println("비겼습니다");
		}
		switch(myValue) {
		case 0 :
			if(comValue == 1) {
				comWin();
			}
			else
				if(comValue == 2) {
				youWin();
			}
			break;
		case 1 :

			if(comValue == 2) {
				comWin();
			}
			else if(comValue == 0) {
				youWin();
			}
			break;
		case 2 : 

			if(comValue == 0) {
				comWin();
			}
			else if(comValue == 1) {
				youWin();
			}
			break;
		}

		System.out.println("컴퓨터의 선택 : "+value(comValue));
		System.out.println("당신의 선택 : "+value(myValue));
	}

	public static void comWin() {System.out.println("졌습니다");}
	public static void youWin() {System.out.println("이겼습니다");}
	

	public static String value(int a) {
		String value = "";
		switch(a) {
		case 0 :
			value = "가위";
			break;
		case 1 :
			value = "바위";
			break;
		case 2 : 
			value = "보";
			break;
		}
		return value;
	}

}
