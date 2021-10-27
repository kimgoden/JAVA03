package project04;

public class capter09 {
	public static void main(String [] args) {
		int[][] a = { {5,5,5,5,5}, {10,10,10,10,20}, {20,20,20,20,20},{30,30,30,30,30}};
		int sum= 0;
		
		for(int b= 0; b<a.length; b++) {
			for(int c= 0; c<a[b].length; c++) {
			sum += a[b][c];
			
		}
		}
		int d = a.length;
		int e = a[0].length;
		System.out.println("ÃÑÁ¡: " + sum);
		System.out.println("Æò±Õ: " + sum/(d*e));
	}
}
