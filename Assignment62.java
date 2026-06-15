package module;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 3;
		String[] s1 = new String[size];
		String[] s2 = new String[size];
		for (int i = 0; i < size; i++) {
			s1[i] = sc.nextLine();

		}
		sc.close();
		for (int i = 0; i < size; i++) {

			s2[i] = s1[i];
		}
		System.out.println("first Array=My name:->" + Arrays.toString(s1));
		System.out.println(" Copyied Array=My name:->" + Arrays.toString(s2));

	}
}