package module;

import java.util.Arrays;

public class Assign66 {
	public static void main(String[] args) {
		String str = "TEA";
		String str1 = "EnAT";
		if(str.length()==str1.length()) {
			System.out.println("Both Are String are anagram");	
		}else {
		char[] c1 = str.toCharArray();
		char[] c2 = str1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("Both Are String are anagram");
		} else {
			System.out.println("Both String are not anagram");
		}
	}
	}
}
