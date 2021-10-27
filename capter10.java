package project04;

public class capter10 {
	public static void main(String [] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] y = new int[3];

		for (int a = 0; a < x.length; a++) {
			int b = (int) (Math.random() * x.length);
			int tmp = 0;
			tmp = x[a];

			x[a] = x[b];

			x[b] = tmp;
			
		}
	
		System.arraycopy(x,0, y,0,3);
		for(int a=0; a<3;a++) {
			System.out.print(y[a]);
		}
	} 
} 
