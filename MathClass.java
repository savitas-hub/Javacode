package module;

import java.util.Scanner;

public class MathClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextByte();
		System.out.println("Squaroot" +Math.sqrt(a));
		System.out.println("Maximum"+Math.max(a, b));
		System.out.println("Minimum"+Math.min(a, b));
		System.out.println("Absolutevalue"+Math.abs(a));
		System.out.println("addition" +Math.addExact(a,b));
		System.out.println("Multification"+ Math.multiplyExact(a, b));
		System.out.println("substration"+Math.subtractExact(a, b));
	}

}
