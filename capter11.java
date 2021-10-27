package project04;

public class capter11 {
	public static void main(String [] args) {
		int [] x = new int [] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int y=0;
		int a=0;
		
		for(int z=0; z<x.length; z++) {
			if(y<x[z]) {
				y = x[z];
			}
			
			}
			
		System.out.println("가장 큰 수는 : "+ y);
	}
}
