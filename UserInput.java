package module;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Please Enter Student Name");
		String username = s1.next();

		System.out.println("Please Enter age");
		int age = s1.nextInt();
		System.out.println("Please Enter sub1");
		int sub1=s1.nextInt();
		System.out.println("Please Enter sub2");
		int sub2=s1.nextInt();
		System.out.println("Please Enter sub3");
		int sub3=s1.nextInt();
		
		int total=(sub1+sub2+sub3)/3;
		System.out.println(total);
		s1.close();
	}

}
