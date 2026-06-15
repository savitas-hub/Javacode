package module;

import java.util.ArrayList;

public class Assign75 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(20);
	al.add(40);
	al.add(1, 30);
	System.out.println(al);
	
	ArrayList<Integer> a2=new ArrayList<Integer>();
	a2.add(50);
	a2.add(60);
	a2.addAll(1, al);

	boolean bb=a2.contains(1);
	boolean b2=a2.containsAll(al);
	System.out.println(b2);
	System.out.println(bb);
	int num=a2.remove(1);
	System.out.println(num);
	
	System.out.println(a2);
}

}