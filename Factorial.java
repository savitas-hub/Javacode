package module;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= 2; i++) {
			fact = fact * i;
		}
			System.out.println( fact);
		
	}
}
