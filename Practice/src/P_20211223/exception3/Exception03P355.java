package P_20211223.exception3;

public class Exception03P355 {
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,0};
		try {
			for(int i = 0; i<7;i++) {
				System.out.println(num[i]);
			}
			System.out.println(num[4]/num[5]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("인덱스 범위 밖입니다.");
		}catch (ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (Exception e){
			
		}
	}
}
