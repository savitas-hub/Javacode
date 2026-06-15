package module;

import java.util.Arrays;

public class Assign65 {
public static void main(String[] args) {
	String[] s1=new String[4];
	
	s1[0]="kavita";
	s1[1]="aman";
	s1[2]="nhoomi";
	s1[3]="panu";
	
	
	String[] s2=new String[4];
	s2[0]="kavita";
	s2[1]="aman";
	s2[2]="nhoomi";
	s2[3]="panu";
	boolean b1=Arrays.equals(s1, s2);
	if(b1==true) {
		System.out.println("Both Array Equals");
	}else {
		System.out.println("Both Array not Same");
	}
}
}
