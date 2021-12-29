package P_20211229.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileIO01P674 {
	public static void main(String[] args) {
		try {
			FileWriter op = new FileWriter("c:/io/test.txt");
			op.write("1234");
			op.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
