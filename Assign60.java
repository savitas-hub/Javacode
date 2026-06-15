package module;

import java.util.Scanner;

public class Assign60 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=3;

	String[] names=new String[size];
	
	String[] initial=new String[size];
	int[] rollno=new int[size];
	//for student 1
	
	for(int i=0;i<size;i++) {

	names[i]=sc.nextLine();
	initial[i]=sc.nextLine();
	rollno[i]=sc.nextInt();
sc.nextLine();
	
	}
for(int i=0;i<size;i++) {
	
	System.out.println("Student no:->"+rollno[i]);
	System.out.println("My name is:->"+names[i] +"My intal is :->"+initial[i]+"My rollno:->"+rollno[i]);

}
sc.close();
	}
}
