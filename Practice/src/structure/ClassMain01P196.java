package structure;

public class ClassMain01P196 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonClass pc1 = new PersonClass();
		PersonClass pc2 = new PersonClass();
		pc1.age = 18;
		pc1.name = "박건";
		pc1.P_num = "51813848";
		pc1.uNum = 151358;
		pc1.glasses = true;
		

		pc2.age = 16;
		pc2.name = "윤해찬";
		pc2.P_num = "25263274";
		pc2.uNum = 133211;
		pc2.glasses = false;
		
		pc1.getInfo();
		pc2.getInfo();
		
	}

}
