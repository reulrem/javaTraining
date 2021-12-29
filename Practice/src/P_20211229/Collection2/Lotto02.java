package P_20211229.Collection2;

import java.util.ArrayList;

public class Lotto02 {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();

		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));

		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));
		
	}
}
