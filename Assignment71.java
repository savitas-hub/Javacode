package module;

import java.util.Arrays;

public class Assignment71 {
	static int countword= 0;
	static String reverse="";
	
	public static void main(String[] args) {
		String str = "I Love Automation";
		String[] b = str.split(" ", 3);
	
		int count=	b.length;
		for(int i=str.length()-1;i>=0;i--) {
		reverse=	reverse+str.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(Arrays.toString(b));
		System.out.println(count);
	}
}