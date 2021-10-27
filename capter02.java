package project04;

import java.util.Scanner;

public class capter02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int[] x= new int[5];
		int y =0;
		System.out.println("양수 5개를 입력하세요.");
		
		for(int z=0; z<5; z++) {
			x[z]=sc.nextInt();
			if(y<x[z]) {
				y = x[z];
			}
				
			}
		System.out.println("가장 큰 수는 : "+ y);
		}
		
}
