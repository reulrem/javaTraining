package P_20211220.static2;

public class Asean {
	private static int presentationScore = 19;
	private int check,midTerm,finalTerm;
	
	public Asean(int check,
			int midTerm,
			int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	public void showAsenaInfo () {
		System.out.println("중간고사 : " + midTerm + "점\n" +
				"중간고사 : " + finalTerm + "점\n" +
				"출석율 : " + check + "%\n" +
				"발표점수 : " + presentationScore + "점");
	}
	
	public static void showPresentation() {
		System.out.println("발표점수 : " + presentationScore + "점");
	}
}
