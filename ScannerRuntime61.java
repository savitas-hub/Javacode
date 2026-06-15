package module;

import java.util.Scanner;

public class ScannerRuntime61 {
public static void main(String[] args) {
	String[] name=new String[4];
	name[0]="SAVITA";
	name[1]="kAVITA";
	name[2]="KJUSHI";
	name[3]="PANNU";
	char[] intial=new char[4];
	intial[0]='a';
	intial[1]='b';
	intial[2]='c';
	int[] rollno=new int[4];
	rollno[0]=1;
	rollno[1]=2;
	rollno[2]=3;
	rollno[3]=4;
	for(int i=0;i<4;i++) {
		System.out.println("Student "+	rollno[i]);
		System.out.println("My Name is:->"+	name[i]);
		System.out.println("My Intial is:->"+	intial[i]);
		System.out.println("My RollNo is:->"+	rollno[i]);
	}
	

}
}

