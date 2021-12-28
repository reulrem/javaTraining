package P_20211228.Collection1;

import java.util.ArrayList;

public class ArrayList01P447 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(10);
		a.add(1,100);
		a.set(1, 99);
		System.out.println(a);
		a.set(1, 2);
		a.set(4, 5);
	}
}
