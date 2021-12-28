package P_20211228.Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Lotto01 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();

		Random r = new Random();
		for(int i = 0 ; i < 6 ; i++) {
			int num = r.nextInt(45)+1;
			if(nums.contains(num)) {
				i--;
				continue;
			}
			nums.add(num);
		}

		int lotto ;
		while(true) {
			lotto= r.nextInt(45)+1;
			if(!nums.contains(lotto)) {break;}
		}
		Collections.sort(nums);
		System.out.println("추첨된 번호 : " + nums);
		System.out.println("2등 당첨 번호 : " + lotto);
		
		
		
		
//		try {
//
//			LinkedList<Integer> lottoNums = new LinkedList<>();
//			
//			ArrayList<Integer> myNum = new ArrayList<>();
//			for(int i =0 ; i < 45 ; i++) {
//				lottoNums.add(i+1);
//			}
//
//			for(int i = 0 ; i < 6 ; i++) {
//				int num = r.nextInt(lottoNums.size());
//				myNum.add(lottoNums.get(num));
//				lottoNums.remove(num);
//			}
//			
//			Collections.sort(myNum);
//			System.out.println("추첨된 번호 : " + myNum);
//			System.out.println("2등 당첨 번호 : " + lotto);
//			if(myNum.contains(lotto)) {
//				System.out.println("당첨됨");
//			}
//		}catch(Exception e) {System.out.println(e);}

		
		
	}
}
