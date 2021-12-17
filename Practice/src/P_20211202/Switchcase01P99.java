package P_20211202;

import java.util.Scanner;

public class Switchcase01P99 {
	
	public static void main(String[] args) {
		
//		switch case 구문은 변수 안의 자료가 case문에 제시된 자료와
//		일치하는가의 여부로 논리식이 진행됩니다.
//		switch (변수){
//			case 상수1 : {
//				etc...
//			}
//			case 상수2 : {
//				etc...
//			}
//			default : {
//			}
//		}
//		case에 들어가는 값은 상수 혹은 static 변수만 가능하며 그 외의 일반 변수는 들어갈 수 없습니다.
		
		Scanner sc = new Scanner(System.in);
		int b;
		b = sc.nextInt();
		switch (b) {
			case 1 :{
				System.out.println("one");
				break;
			}
			
			case 2 :{
				System.out.println("two");
				break;
			}
			
			case 3 :{
				System.out.println("three");
				break;	
			}

			case 4 :{
				System.out.println("four");
				break;				
			}

			case 5 :{
				System.out.println("five");
				break;				
			}
			
			default : {
				System.out.println("other");
			}
		}
	}
}
