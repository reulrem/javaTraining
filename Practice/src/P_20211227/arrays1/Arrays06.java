package P_20211227.arrays1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Arrays06 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(now));
	}
}
