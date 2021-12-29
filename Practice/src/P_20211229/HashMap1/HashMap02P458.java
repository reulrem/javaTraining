package P_20211229.HashMap1;

import java.util.HashMap;

public class HashMap02P458 {
	public static void main(String[] args) {
		HashMap<String,Integer> menu = new HashMap<>();
		menu.put("곱창", 19000);
		menu.put("볶음밥", 3000);
		menu.put("주먹밥", 2000);
		menu.put("소주", 1900);
		System.out.println(menu.get("곱창"));
		System.out.println(menu.get("볶음밥"));
		System.out.println(menu.get("소주"));
	}
}
