package P_20211224.string1;

public class String04P399 {
	public static void main(String[] args) {
		String name = "김수한무거북이와두루미삼천갑자동방삭치치카포사리사리센타워리워리세브리깡무두셀라구름위허리케인담벼락서생원에고양이바둑이는돌돌이";
		System.out.println("이름 길이 : " + name.length() +"자");
		
		String report = "제출자 : 황순찬, 발표자 : 황순찬";
		report = report.replace("황순찬", "박건");
		System.out.println(report);
	}
}
