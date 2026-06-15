package module;

public class Assign64 {
	public static void main(String[] args) {
		int[] num = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		int checknumpresent = 20;
		for (int i = 0; i < 4; i++) {
			if (checknumpresent == num[i]) {
				System.out.println("Gieven Number is present in Array");
			}
		
		}
		
	}
}
