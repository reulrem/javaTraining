package P_20211206;

public class WhileQ2 {
	public static void main(String[] args) {
		int i = 2;
			while (i < 10) {
				int j = 1;
				while (j < 9) {
					j++;
					System.out.println(i + " * " + j +"=" + j*i);
				}
				i++;
				System.out.println();
			}
	}
}
