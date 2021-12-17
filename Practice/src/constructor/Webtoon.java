package constructor;

public class Webtoon {
	String name;
	int series = 1;
	String painter;
	boolean complete = false;
	
	public Webtoon(String name, String painter) {
		this.name = name;
		this.series = 1;
		this.painter = painter;
		this.complete = false;
		
	}
	
	  public void getInfo(){

			System.out.println("제목 : " + name +
					", 회차 : " + series + 
					", 작가 : " + painter + 
					", 완결여부 : " + complete );
			System.out.println();
	    }
	
	  public void uploadWebtoon() {
		  series++;
	  }
	  
	  public void complteWebtoon() {
		  complete = true;
	  }
	
}
