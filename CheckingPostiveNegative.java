package module;

public class CheckingPostiveNegative {
	public static void main(String[] args) {
		int a = -21;
		int postive;
		if (a >= 0) {
			postive = a;
			System.out.println("Number is PostiveNo" + a);

		} else {
			postive = a;
			System.out.println("number is NegativeNo" + a);
		}
		if (postive % 2 == 0) {
			System.out.println("Number is evenNum");
		} else {
			System.out.println("Number is oddNum");
		}

	}
}
