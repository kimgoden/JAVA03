package project04;

import java.util.Scanner;

public class capter02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int[] x= new int[5];
		int y =0;
		System.out.println("��� 5���� �Է��ϼ���.");
		
		for(int z=0; z<5; z++) {
			x[z]=sc.nextInt();
			if(y<x[z]) {
				y = x[z];
			}
				
			}
		System.out.println("���� ū ���� : "+ y);
		}
		
}
