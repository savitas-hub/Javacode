package module;

import java.util.Scanner;

public class StringAss58 {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	String[] s2=new String[s1.nextInt()];
	for(int i=0;i<s2.length-1;i++) {
		System.out.println(i);
	s2[i]=s1.next();
	
		}
	System.out.println(s2);
}
}
