package P_20211223.exception3;

import java.util.Scanner;

public class String03P399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해주세요");
		String string = sc.next();

		System.out.println("찾으려는 단어를 입력해주세요");

		String find = sc.next();
		int counting = 0;
		int index = -1;
		

		

		while(true ) {

				int finding = string.indexOf(find,index+1);

				if(finding == -1) {
					System.out.println("단어가 없습니다.");
					break;
				}
				counting++;
				index = finding;
				System.out.println(counting + " 번째 " + find + "는 " + finding + "번째 글자에 있습니다");
		}
		System.out.println(find + "는 총 " + counting + "개 있었습니다.") ;
		sc.close();
	
	}
}
