package project04;

public class capter05 {
	public static void main(String [] args) {
		int[] oldarray = {1,2,3};
		int[] newarray = new int[5];
		
		for(int i=0; i<oldarray.length; i++) {
			newarray[i] = oldarray[i];
		}
		System.out.print("새로운 배열 값: ");
		for(int i= 0; i<newarray.length; i++ ) {
			System.out.print(newarray[i]+ " ");
		}
	}
}
