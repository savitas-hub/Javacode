package module;

public class LargestNum {
	public static void main(String[] args) {
		int a = 3;
		int b = 55;
		int largest;
		if (a > b) {
			largest=a;
			System.out.println("Largest num " + a);

		} else {
			largest=b;
			System.out.println("Largest num " + b);
		
			
		}if(largest%2==0) {
			System.out.println("Number is evenNum");
		}else {
			System.out.println("Number is oddNum");
		}
	}
}