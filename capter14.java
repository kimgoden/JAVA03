package project04;

public class capter14 {
	public static void main(String [] args) {
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int[] c = new int[a.length + b.length];
		int index=0;
		for(int i =0; i<a.length;i++) {
			c[index]=a[i];
			c[index+1]=b[i];
			index += 2;
		}
		System.out.println("c¹è¿­ °ª: ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		
}
}
}