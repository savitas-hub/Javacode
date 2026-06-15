package module;

import java.util.Arrays;

public class Assign63 {
public static void main(String[] args) {
	int size=3;
	String[] s1=new String[size];

	s1[0]="savit";
	s1[1]="kavit";
	s1[2]="avit";
	String[] s2=new String[size];
	for(int i=0,j=s2.length-1;i<s1.length;i++,j--) {
		s2[j]=s1[i];
	}
	System.out.println("first Array=My name:->" + Arrays.toString(s1));
	System.out.println(" reversed Array=My name:->" + Arrays.toString(s2));
}
}
