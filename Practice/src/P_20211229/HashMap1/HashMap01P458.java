package P_20211229.HashMap1;

import java.util.HashMap;

public class HashMap01P458 {
	public static void main(String[] args) {
		HashMap<String,String> a = new HashMap<>();
		a.put("1", "1번");
		a.put("2", "2번");
		a.put("3", "3번");
		System.out.println(a);
		System.out.println(a.get("3"));
	}
}
