package structure;

public class PersonClass {
	
	int age;
	String name;
	String P_num;
	int uNum;
	boolean glasses;
	
	void getInfo() {
		System.out.println(name + "의 정보를 조회합니다");
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + P_num);
		System.out.println("학번 : " + uNum);
		System.out.println("안경 착용여부 : " + glasses);
		System.out.println();
	}
	
	
}
