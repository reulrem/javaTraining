package P_20211206;

public class EnhancedFor02 {
	public static void main(String[] args) {
		int [] math = {96,23,52,82,72,31,58};
		int [] eng = {62,42,68,31,80,77,45};
		int [] com = {10,28,39,74,65,90,98};
		int sum = 0;
		
		for(int score : math) {
			sum += score;
		}
		System.out.println("수학 평균 : " + sum/math.length);
		sum = 0;
		
		for(int score : eng) {
			sum += score;
		}
		System.out.println("영어 평균 : " + sum/math.length);
		sum = 0;
		
		for(int score : com) {
			sum += score;
		}
		System.out.println("프밍 평균 : " + sum/math.length);
	}
}
