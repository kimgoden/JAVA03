package project04;

public class capter01 {
	public static void main(String [] args) {
		int[] socre = { 80,90,100};
		
		System.out.println("socre[0] :" + socre[0]);
		System.out.println("socre[1] :" + socre[1]);
		System.out.println("socre[2] :" + socre[2]);
		
		int sum =0;
		int count = 0;
		for (int i=0; i<3; i++) {		
			sum+= socre[i];
			count++;
		}
		System.out.println("ÃÑÇÕ : " + sum);
		double avg = (double) sum / count;
		System.out.println("Æò±Õ : " + avg);
		
}
}