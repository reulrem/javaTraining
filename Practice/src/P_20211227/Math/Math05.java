package P_20211227.Math;

public class Math05 {
	public static void main(String[] args) {
		double comValue = Math.round(Math.random()*5) + 1;
		double myValue =Math.round(Math.random()*5) + 1;
		if(comValue > myValue) {System.out.println("컴퓨터 승");}
		
		else if(comValue == myValue) {System.out.println("무승부");}
		
		else if(comValue < myValue) {System.out.println("당신 승");}

		System.out.println(comValue);
		System.out.println(myValue);
	}
}
