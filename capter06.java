package project04;

public class capter06 {
		//�迭����
		public static void main(String [] args) {
			int[] oldarray = {1,2,3};
			int[] newarray = new int[5];
			System.arraycopy(oldarray, 0, newarray, 0, oldarray.length);
			System.out.print("���ο� �迭�� ��: ");
			for(int i=0; i<oldarray.length; i++) {
				System.out.print(newarray[i]+ " ");
		
		}
		}

}