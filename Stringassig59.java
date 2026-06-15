package module;

import java.util.Scanner;

public class Stringassig59 {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int size = ss.nextInt();
		System.out.println(size);
		int[] intarr = new int[size];
		
		String[] sc = new String[size];
		
//INPUT FOR INTERGER ARRAY
		for(int i=0;i<size;i++) {
			intarr[i]=ss.nextInt();
		
		}
		for(int i=0;i<size;i++) {
			sc[i]=ss.nextLine();
		}
		System.out.println("interge Arry:");
		for(int i=0;i<size;i++) {
			System.out.println(intarr[i]+"");
		}
		
		System.out.println("string Arry:");
		for(int i=0;i<size;i++) {
			System.out.println(sc[i]+"");
		}
		ss.close();

	}

}
