package project04;

import java.util.Scanner;

public class capter12 {
	

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = {50000,10000,1000,500,100,50,10,1};
		int y= 0;
		int[] z = new int[x.length];
		System.out.println("�ݾ��� �Է��ϼ���");
		y=  sc.nextInt();
		
		System.out.println("�Էµ� �ݾ�: " + y + "��");
		   for(int a = 0; a<x.length; a++) {
			   if(x[a] <=y) {
				   z[a] = y/x[a];
				   y = y%x[a];
			   }
			   System.out.println(x[a]+"��" + z[a] + "��");
		   }
	}
	}


			  
			   



		

