package module;

import java.util.Scanner;

public class StringScanner {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
String name=	s1.next();
char[] arr=name.toCharArray();
for(int i=0;i<arr.length-1;i++) {
	System.out.println(arr[i]);
}
s1.close();
			
}
}
