package P_20211224.string1;

import java.util.Scanner;

public class String10P399 {
	public static void main(String[] args) {
		String nickName = "ㅇㅁㅇ";
		String id = "cayce";
		String pw = "caldea";
		Scanner sc = new Scanner(System.in); 

		System.out.println("아이디를 입력해주세요");
		String uId = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String uPw = sc.next();
		
		if(!uId.equals(id)) {
			System.out.println("아이디가 존재하지 않습니다");
		} else if(!uPw.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다");
		}else {
			System.out.println("환영합니다 " + nickName + "님");
		}
	}
}
