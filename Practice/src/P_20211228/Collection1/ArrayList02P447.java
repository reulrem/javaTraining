package P_20211228.Collection1;

import java.util.ArrayList;

public class ArrayList02P447 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("사과");
		a.add("딸기");
		a.add("망고");
		a.add("블루베리");
		a.add("파인애플");
		
		System.out.println(a);
		
		System.out.println(a.contains("사과"));

		System.out.println(a.isEmpty());
		System.out.println(a.size());

		ArrayList<String> list2 = new ArrayList<>();

		System.out.println(list2.isEmpty());
		System.out.println(list2.size());
	}
}
