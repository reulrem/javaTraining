package P_20211229.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto03 {
	public static void main(String[] args) {
		ArrayList<Integer> youNum = new ArrayList<Integer>();
		ArrayList<Integer> lottoNum = new ArrayList<Integer>();
		Random r = new Random();
		int count = 0;
		
		while(true) {
			count++;
			for(int i = 0 ; i < 6 ; i++) {
				int num1 = r.nextInt(45)+1;
				int num2 = r.nextInt(45)+1;
				
				if(youNum.contains(num1) || lottoNum.contains(num2)) {
					i--;
					continue;
				}
				youNum.add(i,num1);
				lottoNum.add(i,num2);
			}
			Collections.sort(youNum);
			Collections.sort(lottoNum);
			if(youNum.equals(lottoNum)) {
				break;
			}
			youNum.clear();
			lottoNum.clear();
		}
		
		System.out.println("당첨번호 : " + lottoNum);
		
		System.out.println("반복횟수 : " + count);
		
	}
}
