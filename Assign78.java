package module;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assign78 {
public static void main(String[] args) {
	Set<Integer> s1=new HashSet<Integer>();
	s1.add(10);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(50);
	s1.add(60);
	System.out.println(s1);
	s1.add(20);
	s1.add(40);
	System.out.println(s1);
	
	int Size1=s1.size();
	System.out.println(Size1);
	boolean eleCheck=s1.contains(60);
	System.out.println(eleCheck);
	Iterator<Integer> i1=s1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	Set<Integer> s2=new HashSet<Integer>();
	s2.add(22);
	s2.addAll(s1);
	boolean chec=s2.containsAll(s1);
	System.out.println(chec);
	System.out.println(s2.equals(s1));
	boolean ch=s2.remove(23);
	System.out.println(ch);
	System.out.println(s2.removeAll(s1));
	s2.clear();
	boolean isempt=s2.isEmpty();
	System.out.println(isempt);
}
}
