package project04;

public class capter03 {
	public static void main(String [] args) {
		int [] x = { 83, 90, 87};
		
		int y = 0;
		for(int z= 0; z<x.length; z++) {
			y += x[z];
		}
		System.out.println("ÃÑÇÕ : " + y);
		double k =(double) y /x.length;
		System.out.println("Æò±Õ : " + k);
		
}
}