package project04;

public class capter04 {
	public static void main(String [] args) {
		
		int a[][] = { {91, 91}, {91,  91}, {91, 91}, {91, 91} };
		int count= 0;
		int sum= 0;
		for(int b= 0; b<a.length; b++) {
			for(int c=0; c<a[b].length; c++) {
				sum = a[b][c];
				
			}
		}
		
		int k = a.length;
		int m = a[0].length;
		System.out.println("ÃÑÁ¡ : " +sum);
		System.out.println("Æò±Õ : " +sum/(k*m));
		
	}
}
