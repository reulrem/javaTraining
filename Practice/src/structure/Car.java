package structure;

public class Car {
	String model;
	int price;
	String owner;
	
	void getInfo() {
		System.out.println(owner + "의 차정보입니다.");
		System.out.println("모델명 : " + model + ", 가격 : " + price );
		System.out.println();
	}
}
